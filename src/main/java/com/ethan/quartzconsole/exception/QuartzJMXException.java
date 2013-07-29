package com.ethan.quartzconsole.exception;

import java.text.MessageFormat;

public class QuartzJMXException extends RuntimeException{

	 private static final long serialVersionUID = 1L;
     private final String connectionId;

  public QuartzJMXException(String connectionId)
  {
    this.connectionId = connectionId;
  }

  public String getMessage()
  {
    String msg = "Problems with accessing the Quartz Scheduler ({0}). Scheduler may no longer be running.";
    return MessageFormat.format(msg, new Object[] { this.connectionId });
  }
}