package com.carlosasrc.designpatterns.strategy;

public class Contexto {
	private Notificacao notificacao;
	
	public Contexto(Notificacao notificacao) {
		this.notificacao = notificacao;
	}
	
	public String executarNotificacao(String mensagem) {
		return notificacao.enviar(mensagem);
	}
	
	public Notificacao getNotificacao() {
		return notificacao;
	}
}
