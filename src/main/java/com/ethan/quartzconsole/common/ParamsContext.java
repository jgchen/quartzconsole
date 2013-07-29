package com.ethan.quartzconsole.common;

import java.io.Serializable;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.ethan.quartzconsole.meta.ConnectionDetail;
import com.ethan.quartzconsole.meta.JobInfo;
import com.ethan.quartzconsole.meta.TriggerInfo;

public class ParamsContext implements Serializable {
	private static final long serialVersionUID = 2900941963309281102L;
	private ConnectionDetail connectionDetail;
	private String connectionIdentifier;
	private String jobGroupName;
	private JobInfo jobInfo;
	private String jobName;
	private ObjectName objectName;
	private String operationName;
	private Object[] parameters;
	private String quartzVersion;
	private String schedulerInstanceId;
	private String schedulerName;
	private MBeanServerConnection serverConnection;
	private String[] signatures;
	private String triggerGroupName;
	private TriggerInfo triggerInfo;
	private String triggerName;
	private boolean updateJob;
	private String fireInstanceId;

	public ConnectionDetail getConnectionDetail() {
		return this.connectionDetail;
	}

	public String getConnectionIdentifier() {
		if (this.connectionIdentifier != null) {
			return this.connectionIdentifier;
		}
		return this.connectionDetail.getConnectionIdentifier();
	}

	public String getJobGroupName() {
		return this.jobGroupName;
	}

	public JobInfo getJobInfo() {
		return this.jobInfo;
	}

	public String getJobName() {
		return this.jobName;
	}

	public ObjectName getObjectName() {
		return this.objectName;
	}

	public String getOperationName() {
		return this.operationName;
	}

	public Object[] getParameters() {
		return this.parameters;
	}

	public String getQuartzVersion() {
		return this.quartzVersion;
	}

	public String getSchedulerInstanceId() {
		return this.schedulerInstanceId;
	}

	public String getSchedulerName() {
		return this.schedulerName;
	}

	public MBeanServerConnection getServerConnection() {
		return this.serverConnection;
	}

	public String[] getSignatures() {
		return this.signatures;
	}

	public String getTriggerGroupName() {
		return this.triggerGroupName;
	}

	public TriggerInfo getTriggerInfo() {
		return this.triggerInfo;
	}

	public String getTriggerName() {
		return this.triggerName;
	}

	public boolean isUpdateJob() {
		return this.updateJob;
	}

	public String getFireInstanceId() {
		return this.fireInstanceId;
	}

	public ParamsContext setConnectionDetail(ConnectionDetail connectionDetail) {
		this.connectionDetail = connectionDetail;
		return this;
	}

	public ParamsContext setConnectionIdentifier(String connectionIdentifier) {
		this.connectionIdentifier = connectionIdentifier;
		return this;
	}

	public ParamsContext setJobGroupName(String jobGroupName) {
		this.jobGroupName = jobGroupName;

		return this;
	}

	public ParamsContext setJobInfo(JobInfo jobInfo) {
		this.jobInfo = jobInfo;

		return this;
	}

	public ParamsContext setJobName(String jobName) {
		this.jobName = jobName;

		return this;
	}

	public ParamsContext setObjectName(ObjectName objectName) {
		this.objectName = objectName;
		return this;
	}

	public ParamsContext setOperationName(String operationName) {
		this.operationName = operationName;

		return this;
	}

	public ParamsContext setParameters(Object[] parameters) {
		this.parameters = parameters;

		return this;
	}

	public ParamsContext setQuartzVersion(String quartzVersion) {
		this.quartzVersion = quartzVersion;

		return this;
	}

	public ParamsContext setSchedulerInstanceId(String schedulerInstanceId) {
		this.schedulerInstanceId = schedulerInstanceId;
		return this;
	}

	public ParamsContext setSchedulerName(String schedulerName) {
		this.schedulerName = schedulerName;
		return this;
	}

	public ParamsContext setServerConnection(
			MBeanServerConnection serverConnection) {
		this.serverConnection = serverConnection;
		return this;
	}

	public ParamsContext setSignatures(String[] signatures) {
		this.signatures = signatures;

		return this;
	}

	public ParamsContext setTriggerGroupName(String triggerGroupName) {
		this.triggerGroupName = triggerGroupName;

		return this;
	}

	public ParamsContext setTriggerInfo(TriggerInfo triggerInfo) {
		this.triggerInfo = triggerInfo;

		return this;
	}

	public ParamsContext setTriggerName(String triggerName) {
		this.triggerName = triggerName;

		return this;
	}

	public ParamsContext setUpdateJob(boolean updateJob) {
		this.updateJob = updateJob;

		return this;
	}

	public ParamsContext setFireInstanceId(String fireInstanceId) {
		this.fireInstanceId = fireInstanceId;
		return this;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.DEFAULT_STYLE);
	}
}