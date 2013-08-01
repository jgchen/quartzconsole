package com.ethan.quartzconsole.meta;

import java.io.Serializable;
import java.util.Date;

public class NotificationInfo
  implements Serializable
{
  private static final long serialVersionUID = -7068524152822626360L;
  private Date timestamp;
  private String type;
  private UserData userData;
  private long sequenceNumber;
  private String message;
  private String schedulerName;
  private String connectionIdentifier;

  public String getConnectionIdentifier()
  {
    return this.connectionIdentifier;
  }

  public void setConnectionIdentifier(String connectionIdentifier) {
    this.connectionIdentifier = connectionIdentifier;
  }

  public Date getTimestamp() {
    return this.timestamp;
  }

  public String getType() {
    return this.type;
  }

  public UserData getUserData() {
    return this.userData;
  }

  public long getSequenceNumber() {
    return this.sequenceNumber;
  }

  public String getMessage() {
    return this.message;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setUserData(UserData userData) {
    this.userData = userData;
  }

  public void setSequenceNumber(long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getSchedulerName() {
    return this.schedulerName;
  }

  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();

    builder.append("NotificationInfo [timestamp=");
    builder.append(this.timestamp);
    builder.append(", schedulerName=");
    builder.append(this.schedulerName);
    builder.append(", connectionIdentifier=");
    builder.append(this.connectionIdentifier);
    builder.append(", type=");
    builder.append(this.type);
    builder.append(", sequenceNumber=");
    builder.append(this.sequenceNumber);
    builder.append(", message=");
    builder.append(this.message);
    builder.append(", userData=");
    builder.append(this.userData);
    builder.append("]");

    return builder.toString();
  }
}