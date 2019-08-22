package com.carlosasrc.designpatterns.strategy.test;

import org.junit.Test;

import com.carlosasrc.designpatterns.strategy.Cliente;
import com.carlosasrc.designpatterns.strategy.EmailNotFoundException;
import com.carlosasrc.designpatterns.strategy.GeradorMensagem;
import com.carlosasrc.designpatterns.strategy.NotificacaoEmail;
import com.carlosasrc.designpatterns.strategy.NotificacaoSMS;

import static org.junit.Assert.*;

import org.junit.Before;

public class MensagemTest {
	
	private GeradorMensagem geradorMsg;
	private Cliente cliente	;
	
	@Before
	public void start() {
		geradorMsg = new GeradorMensagem();
		cliente  = new Cliente("Carlos", "carlos@email.com", "984187545");
	}
	
	@Test
	public void gerarMensagemSMS() {
		geradorMsg.gerarMensagem(cliente);
		boolean mensagemSMS = geradorMsg.getContexto().getNotificacao() instanceof NotificacaoSMS;
		assertTrue(mensagemSMS);
	}
	
	@Test
	public void gerarMensagemSMSNaoExistente() {
		cliente.setTelefone(null);
		geradorMsg.gerarMensagem(cliente);
		boolean mensagemEmail = geradorMsg.getContexto().getNotificacao() instanceof NotificacaoEmail;
		assertTrue(mensagemEmail);
	}
	
	@Test (expected = EmailNotFoundException.class)
	public void gerarMensagemEmailNaoExiste() {
		cliente.setTelefone(null);
		cliente.setEmail(null);
		geradorMsg.gerarMensagem(cliente);
	}
	
}
