package com.coditationsystem.model;

public class Response {

	private String errorCode;
	private Object message;
	private String Status;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Response [errorCode=" + errorCode + ", message=" + message + ", Status=" + Status + "]";
	}

}
