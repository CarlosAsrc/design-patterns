package com.carlosasrc.designpatterns.chainofresponsibility;

public class SMSNotificationHandler extends NotificationHandler {

	public SMSNotificationHandler(NotificationHandler next) {
		super(next);
	}

	@Override
	public void handleRequest(Request request) {
		if(request.getType().equals(RequestType.SMS)) {
			System.out.println("Enviando SMS: "+request.getMessage());
			request.setHandled(true);
		}
		dispatchToNext(request);
	}
}
