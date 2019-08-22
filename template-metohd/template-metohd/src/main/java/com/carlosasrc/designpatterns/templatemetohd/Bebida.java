package com.carlosasrc.designpatterns.templatemetohd;

public class Bebida {
	private boolean cheio;
	private boolean quente;
	private boolean servido;
	
	public Bebida() {
		this.cheio = false;
		this.quente =false;
		this.servido = false;
	}
	
	public boolean isCheio() {
		return cheio;
	}
	
	public void setCheio(boolean cheio) {
		this.cheio = cheio;
	}
	
	public boolean isQuente() {
		return quente;
	}
	
	public void setQuente(boolean quente) {
		this.quente = quente;
	}
	
	public boolean isServido() {
		return servido;
	}
	
	public void setServido(boolean servido) {
		this.servido = servido;
	}
}
