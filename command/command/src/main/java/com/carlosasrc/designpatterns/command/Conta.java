package com.carlosasrc.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	private List<Operacao> operacoes;
	
	public Conta() {
		operacoes = new ArrayList<Operacao>();
	}
	
	public void salvarOperacao(Operacao operacao) {
		operacoes.add(operacao);
	}
	
	public int verificarSaldo() {
		int saldoCalculado = 0;
		for(Operacao operacao: operacoes) {
			saldoCalculado += operacao.executar();
		}
		return saldoCalculado;
	}
}
