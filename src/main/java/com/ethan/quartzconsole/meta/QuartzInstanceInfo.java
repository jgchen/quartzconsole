package com.ethan.quartzconsole.meta;

import java.io.Serializable;
import java.util.List;

public class QuartzInstanceInfo implements Serializable {

	private static final long serialVersionUID = -522738100303106184L;
	private String connectionName;
	private List<SchedulerInfo> schedulerInfos;

	public String getConnectionName() {
		return this.connectionName;
	}

	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}

	public List<SchedulerInfo> getSchedulerInfos() {
		return this.schedulerInfos;
	}

	public void setSchedulerInfos(List<SchedulerInfo> schedulerInfos) {
		this.schedulerInfos = schedulerInfos;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("QuartzInstanceInfo [connectionName=");
		builder.append(this.connectionName);
		builder.append(", schedulerInfos=");
		builder.append(this.schedulerInfos);
		builder.append("]");

		return builder.toString();
	}
}