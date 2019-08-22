package com.carlosasrc.designpatterns.command.test;

import com.carlosasrc.designpatterns.command.Conta;
import com.carlosasrc.designpatterns.command.Deposito;
import com.carlosasrc.designpatterns.command.Operacao;
import com.carlosasrc.designpatterns.command.Saque;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class ContaTest {
	
	private Conta conta;
	private Operacao operacao;
	
	@Before
	public void start() {
		conta = new Conta();
	}
	
	@Test
	public void deveRetornarSaldoInicialTest() {
		int saldo = conta.verificarSaldo();
		assertEquals(0, saldo);
	}
	
	@Test
	public void deveRetornarSaldoPositivoTest() {
		operacao = new Deposito(800);
		conta.salvarOperacao(operacao);
		operacao = new Deposito(200);
		conta.salvarOperacao(operacao);
		int saldo = conta.verificarSaldo();
		assertEquals(1000, saldo);
	}
	
	@Test
	public void deveRetornarSaldoNegativoTest() {
		operacao = new Deposito(800);
		conta.salvarOperacao(operacao);
		operacao = new Saque(1000);
		conta.salvarOperacao(operacao);
		int saldo = conta.verificarSaldo();
		assertEquals(-200, saldo);
	}
}
