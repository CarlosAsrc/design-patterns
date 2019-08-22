package com.carlosasrc.designpatterns.chainofresponsibility;

import java.util.Objects;

public abstract class NotificationHandler {
	private NotificationHandler next;
	
	public NotificationHandler(NotificationHandler next) {
		this.next = next;
	}
	
	public abstract void handleRequest(Request request);
	
	public void dispatchToNext(Request request) {
		if(Objects.nonNull(this.next)) {
			this.next.handleRequest(request);
		}
	}
}
