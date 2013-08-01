package com.ethan.quartzconsole.meta;

import java.io.Serializable;
import java.util.Date;

public class JobInfo implements Serializable{
	
  private static final long serialVersionUID = -5300425204880706608L;
  private String description;
  private boolean durable;
  private String group;
  private String jobClassName;
  private JobDataInfo jobDataInfo;
  private String name;
  private boolean recoveryRequested;
  private boolean volatility;
  private boolean update;
  private Date scheduledFor;

  public String getDescription()
  {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isDurable() {
    return this.durable;
  }

  public void setDurable(boolean durable) {
    this.durable = durable;
  }

  public String getGroup() {
    return this.group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public String getJobClassName() {
    return this.jobClassName;
  }

  public void setJobClassName(String jobClassName) {
    this.jobClassName = jobClassName;
  }

  public JobDataInfo getJobDataInfo() {
    return this.jobDataInfo;
  }

  public void setJobDataInfo(JobDataInfo jobDataInfo) {
    this.jobDataInfo = jobDataInfo;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isRecoveryRequested() {
    return this.recoveryRequested;
  }

  public void setRecoveryRequested(boolean recoveryRequested) {
    this.recoveryRequested = recoveryRequested;
  }

  public boolean isVolatile() {
    return this.volatility;
  }

  public void setVolatile(boolean volatility) {
    this.volatility = volatility;
  }

  public Date getScheduledFor() {
    return this.scheduledFor;
  }

  public void setScheduledFor(Date scheduledFor) {
    this.scheduledFor = scheduledFor;
  }

  public boolean isUpdate() {
    return this.update;
  }

  public void setUpdate(boolean update) {
    this.update = update;
  }

  public String toString()
  {
    StringBuilder builder = new StringBuilder();

    builder.append("JobInfo [description=");
    builder.append(this.description);
    builder.append(", durable=");
    builder.append(this.durable);
    builder.append(", group=");
    builder.append(this.group);
    builder.append(", jobClassName=");
    builder.append(this.jobClassName);
    builder.append(", jobDataInfo=");
    builder.append(this.jobDataInfo);
    builder.append(", name=");
    builder.append(this.name);
    builder.append(", recoveryRequested=");
    builder.append(this.recoveryRequested);
    builder.append(", scheduledFor=");
    builder.append(this.scheduledFor);
    builder.append(", update=");
    builder.append(this.update);
    builder.append(", volatility=");
    builder.append(this.volatility);
    builder.append("]");

    return builder.toString();
  }
}