package com.carlosasrc.designpatterns.strategy;

public class NotificacaoSMS implements Notificacao {

	@Override
	public String enviar(String mensagem) {
		return "SMS: "+mensagem;
	}

}
