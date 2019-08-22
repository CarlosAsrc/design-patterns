package com.carlosasrc.designpatterns.chainofresponsibility;

public class Request {
	
	private String message;
	private RequestType type;
	private boolean handled;
	
	public Request() {
		this.handled = false;
	}
	
	public RequestType getType() {
		return type;
	}
	
	public void setType(RequestType type) {
		this.type = type;
	}

	public boolean isHandled() {
		return handled;
	}

	public void setHandled(boolean handled) {
		this.handled = handled;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
