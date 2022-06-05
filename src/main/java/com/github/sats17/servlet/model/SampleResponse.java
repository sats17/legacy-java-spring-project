package com.github.sats17.servlet.model;

public class SampleResponse {

	private String message;
	private String service;

	public SampleResponse(String message, String service) {
		super();
		this.message = message;
		this.service = service;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "SampleResponse [message=" + message + ", service=" + service + "]";
	}

}
