package com.ethan.quartzconsole.common;

import java.io.Serializable;

public class Result implements Serializable {
	private static final long serialVersionUID = 186688149369372429L;
	private boolean success;
	private String message;
	private String statusCode;
	private Object value;
	public static final Result SUCCESS = new Result(true);
	public static final Result FAILURE = new Result(false);

	public Result() {
		this.success = true;
	}

	public Result(boolean status) {
		this.success = status;
	}

	public Result(boolean status, String message) {
		this.success = status;
		this.message = message;
	}

	public void change(boolean status, String msg) {
		this.success = status;
		this.message = msg;
	}

	public boolean isSuccess() {
		return this.success;
	}

	public boolean isFailure() {
		return !this.success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("Result [success=");
		builder.append(this.success);
		builder.append(", message=");
		builder.append(this.message);
		builder.append(", value=");
		builder.append(this.value);
		builder.append("]");

		return builder.toString();
	}
}