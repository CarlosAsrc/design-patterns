package com.carlosasrc.designpatterns.chainofresponsibility;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class NotificationHandlerTest {
	
	private NotificationHandler smsNotificationHandler;
	private NotificationHandler emailNotificationHandler;
	private NotificationHandler musicNotificationHandler;
	private Request request;
	
	@Before
	public void start() {
		smsNotificationHandler = new SMSNotificationHandler(null);
		emailNotificationHandler = new EmailNotificationHandler(smsNotificationHandler);
		musicNotificationHandler = new MusicNotificationHandler(emailNotificationHandler);
		request = new Request();
	}
	
	@Test
	public void smsNotificationTest() {
		request.setType(RequestType.SMS);
		request.setMessage("Na minha máquina funciona :D");
		musicNotificationHandler.handleRequest(request);
		assertTrue(request.isHandled());
	}
	
	@Test
	public void emailNotificationTest() {
		request.setType(RequestType.EMAIL);
		request.setMessage("Na minha máquina funciona :D");
		musicNotificationHandler.handleRequest(request);
		assertTrue(request.isHandled());
	}
	
	@Test
	public void musicNotificationTest() {
		request.setType(RequestType.MUSIC);
		request.setMessage("Tocando agora: Falling Away From Me - Korn");
		musicNotificationHandler.handleRequest(request);
		assertTrue(request.isHandled());
	}
	
	@Test (expected = NullPointerException.class)
	public void invalidTypenotificationTest() {
		request.setType(null);
		request.setMessage("Na minha máquina funciona :D");
		musicNotificationHandler.handleRequest(request);
	}
}
