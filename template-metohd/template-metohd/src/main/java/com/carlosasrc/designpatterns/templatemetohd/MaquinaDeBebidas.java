package com.carlosasrc.designpatterns.templatemetohd;

public abstract class MaquinaDeBebidas {
	
	protected Bebida bebida;
	
	public MaquinaDeBebidas(Bebida bebida) {
		this.bebida = bebida;
	}
	
	public abstract void encher();
	public abstract void esquentar();
	public abstract void servir();
	
	public final void preparar() {
		encher();
		esquentar();
		servir();
	}
	
	public final Bebida getBebida() {
		return this.bebida;
	}
	
}
