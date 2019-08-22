package com.carlosasrc.designpatterns.templatemetohd;

public class MaquinaDeCha extends MaquinaDeBebidas{

	public MaquinaDeCha() {
		super(new Bebida());
	}
	
	@Override
	public void encher() {
		this.bebida.setCheio(true);
		System.out.println("Encheu copo de chá.");
		
	}

	@Override
	public void esquentar() {
		this.bebida.setQuente(true);
		System.out.println("Esquentou copo de chá.");
	}

	@Override
	public void servir() {
		this.bebida.setServido(true);
		System.out.println("Serviu copo de chá.");
		
	}

}
