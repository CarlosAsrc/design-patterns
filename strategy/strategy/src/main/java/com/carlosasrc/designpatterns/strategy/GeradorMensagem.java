package com.carlosasrc.designpatterns.strategy;

import java.util.Optional;

public class GeradorMensagem {
	
	private Contexto contexto;
	
	public String gerarMensagem(Cliente cliente) {
		String mensagem = "Hello " + cliente.getNome();
		Optional<String> telefone = Optional.ofNullable(cliente.getTelefone());
		
		Notificacao notificacao;
		
		if(telefone.isPresent()) {
			notificacao = new NotificacaoSMS();
		} else {
			Optional<String> email = Optional.ofNullable(cliente.getEmail());
			if(email.isPresent()) {
				notificacao = new NotificacaoEmail();
			} else {
				throw new EmailNotFoundException("Email obrigatório não cadastrado.");
			}
		}
		contexto = new Contexto(notificacao);
		return contexto.executarNotificacao(mensagem);
	}
	
	
	public Contexto getContexto() {
		return this.contexto;
	}
}
