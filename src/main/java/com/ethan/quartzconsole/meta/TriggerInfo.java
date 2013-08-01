package com.ethan.quartzconsole.meta;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class TriggerInfo implements Serializable {
	private static final long serialVersionUID = 2948695456415300276L;
	private String triggerName;
	private Map<String, String> triggerData;
	private String calendarName;
	private String description;
	private Date endTime;
	private Date finalFireTime;
	private String fireInstanceId;
	private JobDataInfo jobDataInfo;
	private String jobGroup;
	private String jobName;
	private int misfireInstruction;
	private Date nextFireTime;
	private Date previousFireTime;
	private int priority;
	private Date startTime;
	private boolean volatility;
	private String group;
	private String triggerState;
	private String cronExpression;
	private String triggerType;
	private int repeatCount;
	private long repeatInterval;
	public static final String TRIGGER_TYPE_CRON = "CronTrigger";
	public static final String TRIGGER_TYPE_SIMPLE = "SimpleTrigger";
	public static final String SIMPLE_TRIGGER_CLASS_NAME = "org.quartz.impl.triggers.SimpleTriggerImpl";
	public static final String CRON_TRIGGER_CLASS_NAME = "org.quartz.impl.triggers.CronTriggerImpl";

	public String getTriggerName() {
		return this.triggerName;
	}

	public Map<String, String> getTriggerData() {
		return this.triggerData;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public void setTriggerData(Map<String, String> triggerData) {
		this.triggerData = triggerData;
	}

	public String getCalendarName() {
		return this.calendarName;
	}

	public void setCalendarName(String calendarName) {
		this.calendarName = calendarName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getFinalFireTime() {
		return this.finalFireTime;
	}

	public void setFinalFireTime(Date finalFireTime) {
		this.finalFireTime = finalFireTime;
	}

	public String getFireInstanceId() {
		return this.fireInstanceId;
	}

	public void setFireInstanceId(String fireInstanceId) {
		this.fireInstanceId = fireInstanceId;
	}

	public JobDataInfo getJobDataInfo() {
		return this.jobDataInfo;
	}

	public void setJobDataInfo(JobDataInfo jobDataInfo) {
		this.jobDataInfo = jobDataInfo;
	}

	public String getJobGroup() {
		return this.jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public int getMisfireInstruction() {
		return this.misfireInstruction;
	}

	public void setMisfireInstruction(int misfireInstruction) {
		this.misfireInstruction = misfireInstruction;
	}

	public Date getNextFireTime() {
		return this.nextFireTime;
	}

	public void setNextFireTime(Date nextFireTime) {
		this.nextFireTime = nextFireTime;
	}

	public Date getPreviousFireTime() {
		return this.previousFireTime;
	}

	public void setPreviousFireTime(Date previousFireTime) {
		this.previousFireTime = previousFireTime;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public boolean isVolatility() {
		return this.volatility;
	}

	public void setVolatility(boolean volatility) {
		this.volatility = volatility;
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getTriggerState() {
		return this.triggerState;
	}

	public void setTriggerState(String triggerState) {
		this.triggerState = triggerState;
	}

	public String getCronExpression() {
		return this.cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getTriggerType() {
		return this.triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

	public int getRepeatCount() {
		return this.repeatCount;
	}

	public void setRepeatCount(int repeatCount) {
		this.repeatCount = repeatCount;
	}

	public long getRepeatInterval() {
		return this.repeatInterval;
	}

	public void setRepeatInterval(long repeatInterval) {
		this.repeatInterval = repeatInterval;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TriggerInfo [calendarName=");
		builder.append(this.calendarName);
		builder.append(", cronExpression=");
		builder.append(this.cronExpression);
		builder.append(", description=");
		builder.append(this.description);
		builder.append(", endTime=");
		builder.append(this.endTime);
		builder.append(", finalFireTime=");
		builder.append(this.finalFireTime);
		builder.append(", fireInstanceId=");
		builder.append(this.fireInstanceId);
		builder.append(", group=");
		builder.append(this.group);
		builder.append(", jobDataInfo=");
		builder.append(this.jobDataInfo);
		builder.append(", jobGroup=");
		builder.append(this.jobGroup);
		builder.append(", jobName=");
		builder.append(this.jobName);
		builder.append(", misfireInstruction=");
		builder.append(this.misfireInstruction);
		builder.append(", nextFireTime=");
		builder.append(this.nextFireTime);
		builder.append(", previousFireTime=");
		builder.append(this.previousFireTime);
		builder.append(", priority=");
		builder.append(this.priority);
		builder.append(", startTime=");
		builder.append(this.startTime);
		builder.append(", triggerData=");
		builder.append(this.triggerData);
		builder.append(", triggerName=");
		builder.append(this.triggerName);
		builder.append(", triggerState=");
		builder.append(this.triggerState);
		builder.append(", triggerType=");
		builder.append(this.triggerType);
		builder.append(", volatility=");
		builder.append(this.volatility);
		builder.append(", repeatCount=");
		builder.append(this.repeatCount);
		builder.append(", repeatInterval=");
		builder.append(this.repeatInterval);
		builder.append("]");

		return builder.toString();
	}
}