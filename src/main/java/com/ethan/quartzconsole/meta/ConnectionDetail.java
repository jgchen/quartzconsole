package com.ethan.quartzconsole.meta;

import java.io.Serializable;

public class ConnectionDetail implements Serializable
{
  private static final long serialVersionUID = 5197893799051626160L;
  private String name;
  private String host;
  private int port;
  private transient String userName;
  private transient String password;
  private boolean local;

  public String getName()
  {
    return this.name;
  }

  public String getHost() {
    return this.host;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPort() {
    return this.port;
  }

  public String getUserName() {
    return this.userName;
  }

  public String getPassword() {
    return this.password;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getConnectionIdentifier() {
    return this.host + ":" + this.port;
  }

  public boolean isLocal() {
    return this.local;
  }

  public void setLocal(boolean local) {
    this.local = local;
  }

  public void update(ConnectionDetail connectionDetail) {
    this.name = connectionDetail.getName();
    this.host = connectionDetail.getHost();
    this.port = connectionDetail.getPort();
    this.userName = connectionDetail.getUserName();
    this.password = connectionDetail.getPassword();
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();

    builder.append("ConnectionDetail [");
    builder.append("name=");
    builder.append(this.name);
    builder.append(", host=");
    builder.append(this.host);
    builder.append(", port=");
    builder.append(this.port);
    builder.append(", userName=");
    builder.append(this.userName);
    builder.append(", password=");
    builder.append(this.password);
    builder.append(", local=");
    builder.append(this.local);

    builder.append("]");

    return builder.toString();
  }
}