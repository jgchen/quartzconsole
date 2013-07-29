package com.ethan.quartzconsole.service.impl;

import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.management.InstanceNotFoundException;
import javax.management.MBeanInfo;
import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import javax.naming.ServiceUnavailableException;
import javax.security.auth.login.FailedLoginException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.ethan.quartzconsole.common.ParamsContext;
import com.ethan.quartzconsole.common.Result;
import com.ethan.quartzconsole.meta.ConnectionDetail;
import com.ethan.quartzconsole.meta.QuartzAdapter;
import com.ethan.quartzconsole.service.QuartzManagerService;

public class QuartzManagerServiceImpl  implements QuartzManagerService , ApplicationContextAware, Serializable {
	

	private static final long serialVersionUID = -486659933483622783L;
	
	private final Map<String, Map<String, ObjectName>> objectNameMap = new HashMap();
	private final Map<String, MBeanServerConnection> connectionCache = new HashMap();
	private ApplicationContext applicationContext ;
	private QuartzAdapter quartzAdapter;

    public QuartzAdapter getQuartzAdapter() {
		return quartzAdapter;
	}

	public void setQuartzAdapter(QuartzAdapter quartzAdapter) {
		this.quartzAdapter = quartzAdapter;
	}

	
	
	public Result getQuartzInstanceInfo(String connectionIdentifier){
		Result result = new Result();
	    MBeanServerConnection serverConnection = connectionCache.get(connectionIdentifier);

	    Map map = (Map)this.objectNameMap.get(connectionIdentifier);
	    if(serverConnection == null){
			result.change(false, "链接不存在,请重新连接 ");
		    return result;
	    }
	    ObjectName objectName = (ObjectName)map.values().iterator().next();
	    
	    ParamsContext paramInput = new ParamsContext();
	    paramInput.setConnectionIdentifier(connectionIdentifier);
	    paramInput.setServerConnection(serverConnection);
	    paramInput.setObjectName(objectName);
	    Result checkResult = checkParams(paramInput);
	    if(checkResult.isFailure()){
	    	return checkResult;
	    }
		return quartzAdapter.getQuartzInstanceInfo(paramInput ,  map.values());
		

		
	}
	
	public Result connectServer(ConnectionDetail connectionDetail) {
		Result result = new Result();

		String connectionIdentifier = connectionDetail.getConnectionIdentifier();
		MBeanServerConnection serverConnection = null;
		try {

				JMXServiceURL serviceUrl = createJmxServiceUrl(connectionDetail);
				
				JMXConnector jmxConnector = JMXConnectorFactory.connect(
						serviceUrl, prepareCredentialMap(connectionDetail));

				serverConnection = jmxConnector.getMBeanServerConnection();

				 Set<ObjectName> objectNames = schedulerSearch(serverConnection);
				
				if ((objectNames == null) || (objectNames.size() == 0)) {
					result.change(false, "该机器没有quartz实例");
					result.setStatusCode("connectionDetail.noQuartzMbean");
					return result;
				}
				cacheObjectNames(serverConnection,connectionIdentifier,objectNames);

				cacheConnection(connectionIdentifier, serverConnection);

				result.setSuccess(true);

		} catch (Exception cause) {
			String message = cause.getMessage();
			if ((cause instanceof SecurityException)) {
				if ((cause.getCause() instanceof FailedLoginException))
					message = "没有权限连接到该机器";
			} else if (((cause instanceof IOException))&& ((cause.getCause() instanceof ServiceUnavailableException))) {
				message ="连接到远程机器失败";
			}
			result.change(false, message);
		}

		return result;
	}

	  private void cacheObjectNames(MBeanServerConnection serverConnection, String connectionIdentifier, Set<ObjectName> objectNames) throws Exception
	  {
	    Map map = new HashMap();
	    for (ObjectName objectName : objectNames) {
	      String schedulerName = (String)serverConnection.getAttribute(objectName, "SchedulerName");

	      map.put(schedulerName, objectName);
	    }
	     this.objectNameMap.put(connectionIdentifier, map);
	  }
	  
	  private void cacheConnection(String connectionIdentifier, MBeanServerConnection serverConnection)
	  {
	    this.connectionCache.put(connectionIdentifier, serverConnection);
	  }

	private JMXServiceURL createJmxServiceUrl(ConnectionDetail connectionDetail)
			throws MalformedURLException {

		StringBuffer buf = new StringBuffer();
		buf.append("service:jmx:rmi:///jndi/rmi://");
		buf.append(connectionDetail.getHost());
		buf.append(":");
		buf.append(connectionDetail.getPort());
		buf.append("/");
		buf.append("jmxrmi");
		String serviceUrl = buf.toString();
		return new JMXServiceURL(serviceUrl);
	}

	@SuppressWarnings("rawtypes")
	private Map<String, Object> prepareCredentialMap(ConnectionDetail connectionDetail) {
		Map credentialMap = new HashMap();
		String[] credentials = { connectionDetail.getUserName(),connectionDetail.getPassword() };
		credentialMap.put("jmx.remote.credentials", credentials);
		return credentialMap;
	}
	
	
	  private Set<ObjectName> schedulerSearch(MBeanServerConnection mbeanServer) throws Exception{
			    Set rv = new HashSet();
			    for (String domain : mbeanServer.getDomains()) {
			       Set<ObjectName> set = mbeanServer.queryNames(new ObjectName(domain + ":*"), null);
			      for (ObjectName on : set) {
			        MBeanInfo mbean = mbeanServer.getMBeanInfo(on);
			        if (mbean.getClassName().equals("org.quartz.core.QuartzSchedulerMBeanImpl"))
			        	rv.add(on);
			      }
			    }

			    return rv;
		}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
		
	}

	@Override
	public Result standbyScheduler(String connectionIdentifier, String schedulerName, String schedulerInstanceId) {
		ParamsContext input = new ParamsContext();
		input.setConnectionIdentifier(connectionIdentifier);
		input.setSchedulerName(schedulerName);
		input.setSchedulerInstanceId(schedulerInstanceId);
	    MBeanServerConnection serverConnection = connectionCache.get(connectionIdentifier);
	    input.setServerConnection(serverConnection);
	    Map<String, ObjectName> objectNames = objectNameMap.get(connectionIdentifier);
	    ObjectName objectName = objectNames.get(schedulerName);
	    input.setObjectName(objectName);
		Result checkResult = checkParams(input);
		if(checkResult.isFailure()){
		    return checkResult;
		 }
		 return quartzAdapter.standbyScheduler(input);

	}

	private Result checkParams(ParamsContext input) {
		  Result result = new Result();
		  String connectionIdentifier = input.getConnectionIdentifier();
		  MBeanServerConnection serverConnection = input.getServerConnection();
		  if (serverConnection == null) {
		      result.change(false, "链接不存在,请重新连接 ");
		      return result;
		   }
	      ObjectName objectName = input.getObjectName();
	      try {
	        serverConnection.getAttribute(objectName, "Version");
	        result.setSuccess(true);
	      } catch (InstanceNotFoundException ne) {
	        result.change(false, "连接实例已不存在");
	      } catch (Exception cause) {
	    	  result.change(false, "连接失败");
	      }
		  return result;
	}

	@Override
	public Result getSchedulerInfo(String connectionIdentifier) {
		// TODO Auto-generated method stub
		return null;
	}




}
