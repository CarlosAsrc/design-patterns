package com.carlosasrc.designpatterns.command;

public class Deposito implements Operacao{

	private int valor;
	
	public Deposito(int valor) {
		this.valor = valor;
	}
	
	@Override
	public int executar() {
		return valor;
	}
}
