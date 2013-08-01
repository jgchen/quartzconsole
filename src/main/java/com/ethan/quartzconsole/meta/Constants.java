package com.ethan.quartzconsole.meta;

import java.util.Map;
import javax.management.openmbean.CompositeData;

public class Constants
{
  public static final String QUARTZ_MANAGER_DEFAULT_DIRECTORY_PROPERTY = "user.home";
  public static final String QUARTZ_MANAGER_DIRECTORY_PROPERTY = "quartzmgr_dir";
  public static final String QUARTZ_MANAGER_DIRECTORY = "quartzmgr";
  public static final String QUARTZ_MANAGER_LOG_DIRECTORY = "logs";
  public static final String QUARTZ_MANAGER_CONFIG_DIRECTORY = "conf";
  public static final String QUARTZ_MANAGER_ENCRYPTION_PASSWORD = "quartzManager.encryption.password";
  public static final String JAVAX_NET_SSL_TRUSTSTORE = "javax.net.ssl.trustStore";
  public static final String JAVAX_NET_SSL_TRUSTSTORE_PASSWORD = "javax.net.ssl.trustStorePassword";
  public static final String CONNECTION_STORE_FILE_NAME = "connection-store.xml";
  public static final String LOG_FILE_NAME = "quartzmgr.log";
  public static final String LOG4J_CONFIG_FILE_NAME = "classpath:log4j.config.xml";
  public static final String LOG4J_DEBUG_FILE_NAME = "classpath:log4j-debug.config.xml";
  public static final String TYPE_BOOLEAN = Boolean.TYPE.getName();
  public static final String TYPE_COMPOSITE_DATA = CompositeData.class.getName();
  public static final String TYPE_MAP = Map.class.getName();
  public static final String TYPE_STRING = String.class.getName();
  public static final int STATE_NONE = -1;
  public static final int STATE_NORMAL = 0;
  public static final int STATE_PAUSED = 1;
  public static final int STATE_COMPLETE = 2;
  public static final int STATE_ERROR = 3;
  public static final int STATE_BLOCKED = 4;
  public static final String STATE_NONE_STRING = "NONE";
  public static final String STATE_NORMAL_STRING = "NORMAL";
  public static final String STATE_PAUSED_STRING = "PAUSED";
  public static final String STATE_COMPLETE_STRING = "COMPLETE";
  public static final String STATE_ERROR_STRING = "ERROR";
  public static final String STATE_BLOCKED_STRING = "BLOCKED";
  public static final String FILTER_CONNECTION_IDENTIFIER = "connectionIdentifier";
  public static final String FILTER_SCHEDULER_NAME = "schedulerName";
}