package com.carlosasrc.designpatterns.factory;

public class AviaoMonomotor implements Aviao{
	
	private boolean motorUmLigado;
	
	public AviaoMonomotor() {
		this.motorUmLigado = false;
	}
	
	@Override
	public void ligar() {
		this.motorUmLigado = true;
	}

	@Override
	public void desligar() {
		this.motorUmLigado = false;
	}
	@Override
	public boolean estaLigado() {
		return motorUmLigado;
	}

}
