package com.ethan.quartzconsole.service;

import com.ethan.quartzconsole.common.Result;
import com.ethan.quartzconsole.meta.ConnectionDetail;
import com.ethan.quartzconsole.meta.JobInfo;
import com.ethan.quartzconsole.meta.TriggerInfo;

public  interface QuartzManagerService{
	
	public Result getQuartzInstanceInfo(String connectionIdentifier);
	
	public Result connectServer(ConnectionDetail connectionDetail) ;

	
	public Result standbyScheduler(String connectionIdentifier, String schedulerName, String schedulerInstanceId);
	
	public Result getSchedulerInfo(String connectionIdentifier);

	}