package com.carlosasrc.designpatterns.templatemetohd;

public class MaquinaDeCafe extends MaquinaDeBebidas{

	public MaquinaDeCafe() {
		super(new Bebida());
	}
	
	@Override
	public void encher() {
		super.bebida.setCheio(true);
		System.out.println("Encheu copo de café.");
		
	}

	@Override
	public void esquentar() {
		this.bebida.setQuente(true);
		System.out.println("Esquentou copo de café.");
	}

	@Override
	public void servir() {
		this.bebida.setServido(true);
		System.out.println("Serviu copo de café.");
		
	}

}
