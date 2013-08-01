package com.ethan.quartzconsole.meta;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class JobDataInfo
  implements Serializable
{
  private static final long serialVersionUID = 6554838209886437958L;
  private Map<String, Object> values;

  public JobDataInfo()
  {
    this.values = new HashMap();
  }

  public void put(String key, Object value) {
    this.values.put(key, value);
  }

  public Map<String, Object> getValues() {
    if (this.values == null) {
      this.values = new HashMap();
    }

    return this.values;
  }

  public void setValues(Map<String, Object> values) {
    this.values = values;
  }

  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append("JobDataInfo [values=");
    builder.append(this.values);
    builder.append("]");
    return builder.toString();
  }
}