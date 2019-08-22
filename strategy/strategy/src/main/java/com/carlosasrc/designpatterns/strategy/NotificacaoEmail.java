package com.carlosasrc.designpatterns.strategy;

public class NotificacaoEmail implements Notificacao{

	@Override
	public String enviar(String mensagem) {
		return "Email: "+mensagem;
	}

}
