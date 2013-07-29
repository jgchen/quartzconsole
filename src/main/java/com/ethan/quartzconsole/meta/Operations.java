package com.ethan.quartzconsole.meta;

public abstract interface Operations
{
  public static final String OPERATION_ADD_JOB = "addJob";
  public static final String OPERATION_DELETE_JOB = "deleteJob";
  public static final String OPERATION_GET_ALL_JOB_DETAILS = "getAllJobDetails";
  public static final String OPERATION_GET_ALL_TRIGGERS = "getAllTriggers";
  public static final String OPERATION_GET_TRIGGERS_OF_JOB = "getTriggersOfJob";
  public static final String OPERATION_GET_TRIGGER_STATE = "getTriggerState";
  public static final String OPERATION_INTERRUPT_JOB = "interruptJob";
  public static final String OPERATION_PAUSE_ALL_TRIGGERS = "pauseAllTriggers";
  public static final String OPERATION_PAUSE_JOB = "pauseJob";
  public static final String OPERATION_PAUSE_JOB_GROUP = "pauseJobGroup";
  public static final String OPERATION_PAUSE_TRIGGER = "pauseTrigger";
  public static final String OPERATION_PAUSE_TRIGGERS = "pauseTriggerGroup";
  public static final String OPERATION_RESUME_ALL_TRIGGERS = "resumeAllTriggers";
  public static final String OPERATION_RESUME_JOB = "resumeJob";
  public static final String OPERATION_RESUME_JOB_GROUP = "resumeJobGroup";
  public static final String OPERATION_RESUME_TRIGGER = "resumeTrigger";
  public static final String OPERATION_RESUME_TRIGGERS = "resumeTriggerGroup";
  public static final String OPERATION_SCHEDULE_JOB = "scheduleJob";
  public static final String OPERATION_SHUTDOWN_SCHEDULER = "shutdown";
  public static final String OPERATION_STANDBY_SCHEDULER = "standby";
  public static final String OPERATION_START_SCHEDULER = "start";
  public static final String OPERATION_TRIGGER_JOB = "triggerJob";
  public static final String OPERATION_UNSCHEDULE_JOB = "unscheduleJob";
}