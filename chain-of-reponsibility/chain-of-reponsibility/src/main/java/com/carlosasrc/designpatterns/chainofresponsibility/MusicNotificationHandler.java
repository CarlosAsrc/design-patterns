package com.carlosasrc.designpatterns.chainofresponsibility;

public class MusicNotificationHandler extends NotificationHandler {

	public MusicNotificationHandler(NotificationHandler next) {
		super(next);	
	}

	@Override
	public void handleRequest(Request request) {
		if(request.getType().equals(RequestType.MUSIC)) {
			System.out.println("Enviando Notificação de música: "+request.getMessage());
			request.setHandled(true);
		}
		dispatchToNext(request);
	}
}
