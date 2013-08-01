package com.ethan.quartzconsole.meta;

import java.io.Serializable;
import java.util.Date;

public class UserData
  implements Serializable
{
  private static final long serialVersionUID = -6214845568974114827L;
  private String calendarName;
  private Date fireTime;
  private JobDataInfo jobDataInfo;
  private String jobName;
  private long jobRunTime;
  private Date nextFireTime;
  private Date previousFireTime;
  private boolean recovering;
  private int refireCount;
  private Date scheduledFireTime;
  private String schedulerName;
  private String triggerName;
  private String jobGroupName;
  private String triggerGroupName;
  private String fireInstanceId;

  public String getCalendarName()
  {
    return this.calendarName;
  }

  public Date getFireTime() {
    return this.fireTime;
  }

  public JobDataInfo getJobDataInfo() {
    return this.jobDataInfo;
  }

  public String getJobName() {
    return this.jobName;
  }

  public long getJobRunTime() {
    return this.jobRunTime;
  }

  public Date getNextFireTime() {
    return this.nextFireTime;
  }

  public Date getPreviousFireTime() {
    return this.previousFireTime;
  }

  public int getRefireCount() {
    return this.refireCount;
  }

  public Date getScheduledFireTime() {
    return this.scheduledFireTime;
  }

  public String getSchedulerName() {
    return this.schedulerName;
  }

  public String getTriggerName() {
    return this.triggerName;
  }

  public boolean isRecovering() {
    return this.recovering;
  }

  public void setCalendarName(String calendarName) {
    this.calendarName = calendarName;
  }

  public void setFireInstanceId(String fireInstanceId) {
    this.fireInstanceId = fireInstanceId;
  }

  public String getFireInstanceId() {
    return this.fireInstanceId;
  }

  public void setFireTime(Date fireTime) {
    this.fireTime = fireTime;
  }

  public void setJobDataInfo(JobDataInfo jobDataInfo) {
    this.jobDataInfo = jobDataInfo;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public void setJobRunTime(long jobRunTime) {
    this.jobRunTime = jobRunTime;
  }

  public void setNextFireTime(Date nextFireTime) {
    this.nextFireTime = nextFireTime;
  }

  public void setPreviousFireTime(Date previousFireTime) {
    this.previousFireTime = previousFireTime;
  }

  public void setRecovering(boolean recovering) {
    this.recovering = recovering;
  }

  public void setRefireCount(int refireCount) {
    this.refireCount = refireCount;
  }

  public void setScheduledFireTime(Date scheduledFireTime) {
    this.scheduledFireTime = scheduledFireTime;
  }

  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }

  public void setTriggerName(String triggerName) {
    this.triggerName = triggerName;
  }

  public String getJobGroupName() {
    return this.jobGroupName;
  }

  public void setJobGroupName(String jobGroupName) {
    this.jobGroupName = jobGroupName;
  }

  public String getTriggerGroupName() {
    return this.triggerGroupName;
  }

  public void setTriggerGroupName(String triggerGroupName) {
    this.triggerGroupName = triggerGroupName;
  }

  public String toString()
  {
    StringBuilder builder = new StringBuilder();

    builder.append("UserData [calendarName=");
    builder.append(this.calendarName);
    builder.append(", fireTime=");
    builder.append(this.fireTime);
    builder.append(", jobName=");
    builder.append(this.jobName);
    builder.append(", jobGroupName=");
    builder.append(this.jobGroupName);
    builder.append(", jobRunTime=");
    builder.append(this.jobRunTime);
    builder.append(", nextFireTime=");
    builder.append(this.nextFireTime);
    builder.append(", previousFireTime=");
    builder.append(this.previousFireTime);
    builder.append(", recovering=");
    builder.append(this.recovering);
    builder.append(", refireCount=");
    builder.append(this.refireCount);
    builder.append(", scheduledFireTime=");
    builder.append(this.scheduledFireTime);
    builder.append(", schedulerName=");
    builder.append(this.schedulerName);
    builder.append(", triggerName=");
    builder.append(this.triggerName);
    builder.append(", triggerGroupName=");
    builder.append(this.triggerGroupName);
    builder.append(", jobDataInfo=");
    builder.append(this.jobDataInfo);
    builder.append("]");

    return builder.toString();
  }
}