package com.ethan.quartzconsole.meta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;

import com.ethan.quartzconsole.common.ParamsContext;
import com.ethan.quartzconsole.common.Result;
import static   com.ethan.quartzconsole.meta.Operations.*;

public class QuartzAdapterBase implements QuartzAdapter  {

	@Override
	public  Result getQuartzInstanceInfo(ParamsContext paramInput, Collection<ObjectName> objectNames) {
		
	    String connectionIdentifier = paramInput.getConnectionIdentifier();
	    MBeanServerConnection serverConnection = paramInput.getServerConnection();

	    Result result = new Result();


	    try
	    {  	QuartzInstanceInfo quartzInstanceInfo = new QuartzInstanceInfo();
	        quartzInstanceInfo.setConnectionName(connectionIdentifier);
	        ArrayList schedulerInfos = new ArrayList();
	        quartzInstanceInfo.setSchedulerInfos(schedulerInfos);

	        for (ObjectName objectName : objectNames) {
	    	  paramInput.setObjectName(objectName);
	    	  String  schedulerName = (String) serverConnection.getAttribute(objectName, "SchedulerName");
	    	  String  schedulerInstanceId =  (String) serverConnection.getAttribute(objectName, "SchedulerInstanceId");
	    	  paramInput.setSchedulerName(schedulerName);
	    	  paramInput.setSchedulerInstanceId(schedulerInstanceId);
	          schedulerInfos.add(readSchedulerInfo(paramInput));
	       }
		    result.setValue(quartzInstanceInfo);
	    }catch(Exception cause){
	    	result.change(false, "读取quartz实例异常");
	    }
	    return result;
	}

	private SchedulerInfo  readSchedulerInfo(ParamsContext paramInput) {
	    MBeanServerConnection serverConnection = paramInput.getServerConnection();
	    ObjectName objectName = paramInput.getObjectName();
	    ConnectionDetail connectionDetail = paramInput.getConnectionDetail();
	    SchedulerInfo schedulerInfo = new SchedulerInfo();
	    try
	    {
	      String schedulerName = (String)serverConnection.getAttribute(objectName, "SchedulerName");
	      String jobStoreClassName = (String)serverConnection.getAttribute(objectName, "JobStoreClassName");
	      String schedulerInstanceId = (String)serverConnection.getAttribute(objectName, "SchedulerInstanceId");
	      boolean standbyMode = ((Boolean)serverConnection.getAttribute(objectName, "StandbyMode")).booleanValue();
	      boolean started = ((Boolean)serverConnection.getAttribute(objectName, "Started")).booleanValue();
	      String threadPoolClassName = (String)serverConnection.getAttribute(objectName, "ThreadPoolClassName");
	      int threadPoolSize = ((Integer)serverConnection.getAttribute(objectName, "ThreadPoolSize")).intValue();
	      String version = (String)serverConnection.getAttribute(objectName, "Version");
	      String node = paramInput.getConnectionIdentifier();
	      String type = objectName.getKeyProperty("type");

	      schedulerInfo.setSchedulerName(schedulerName);
	      schedulerInfo.setSchedulerInstanceId(schedulerInstanceId);
	      schedulerInfo.setJobStoreClassName(jobStoreClassName);
	      schedulerInfo.setNode(node);
	      schedulerInfo.setStandbyMode(standbyMode);
	      schedulerInfo.setStarted(started);
	      schedulerInfo.setThreadPoolClassName(threadPoolClassName);
	      schedulerInfo.setThreadPoolSize(threadPoolSize);
	      schedulerInfo.setType(type);
	      schedulerInfo.setVersion(version);
	    } catch (Exception cause) {
	    	cause.printStackTrace();
	    }

		return schedulerInfo;
	}

	@Override
	public Result standbyScheduler(ParamsContext input) {
		
		Result result = new Result();

	    input.setParameters(new Object[0]);
	    input.setSignatures(new String[0]);
	    input.setOperationName(OPERATION_STANDBY_SCHEDULER);
	    try
	    {
	      invokeJmxOperation(input);
	    } catch (Exception cause) {
	        result.change(false,cause.getMessage());
	    }
	    return result;
	}

	protected void  invokeJmxOperation(ParamsContext input) {
	    MBeanServerConnection serverConnection = input.getServerConnection();
	    String operationName = input.getOperationName();
	    Object[] params = input.getParameters();
	    String[] signatures = input.getSignatures();
	    ObjectName objectName = input.getObjectName();
	    try {
	    	 Object jmxResult = serverConnection.invoke(objectName, operationName, params, signatures);
	    } catch (Exception cause) {
	      cause.printStackTrace();
	      throw new RuntimeException(cause);
	    }

	}

}
