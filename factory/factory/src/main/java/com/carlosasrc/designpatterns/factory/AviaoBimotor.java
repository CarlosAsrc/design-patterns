package com.carlosasrc.designpatterns.factory;

public class AviaoBimotor implements Aviao{

	private boolean motorUmLigado;
	private boolean motorDoisLigado;
	
	public AviaoBimotor() {
		this.motorUmLigado = false;
		this.motorDoisLigado = false;
	}
	
	
	@Override
	public void ligar() {
		this.motorUmLigado = true;
		this.motorDoisLigado = true;
		
	}

	@Override
	public void desligar() {
		this.motorUmLigado = false;
		this.motorDoisLigado = false;
	}
	@Override
	public boolean estaLigado() {
		return motorUmLigado && motorDoisLigado;
	}

}
