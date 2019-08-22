package com.carlosasrc.designpatterns.command;

public class Saque implements Operacao{

	private int valor;
	
	public Saque(int valor) {
		this.valor = valor;
	}
	
	@Override
	public int executar() {
		return -valor;
	}
}
