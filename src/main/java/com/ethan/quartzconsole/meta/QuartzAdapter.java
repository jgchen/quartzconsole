package com.ethan.quartzconsole.meta;

import java.util.Collection;

import javax.management.ObjectName;

import com.ethan.quartzconsole.common.ParamsContext;
import com.ethan.quartzconsole.common.Result;

public interface QuartzAdapter {

	
	  public  Result getQuartzInstanceInfo(ParamsContext paramInput, Collection<ObjectName> paramCollection);

	   public Result standbyScheduler(ParamsContext input);
 
}
