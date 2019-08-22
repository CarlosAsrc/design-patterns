package com.carlosasrc.designpatterns.strategy;

public class EmailNotFoundException extends RuntimeException{
	public EmailNotFoundException(String msg) {
		super(msg);
	}
}
