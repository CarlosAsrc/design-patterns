package com.carlosasrc.designpatterns.chainofresponsibility;

public class EmailNotificationHandler extends NotificationHandler {

	public EmailNotificationHandler(NotificationHandler next) {
		super(next);
	}

	@Override
	public void handleRequest(Request request) {
		if(request.getType().equals(RequestType.EMAIL)) {
			System.out.println("Enviando mensagem de email: "+request.getMessage());
			request.setHandled(true);
		}
		dispatchToNext(request);
	}
}
