package com.carlosasrc.designpatterns.decorator;

public abstract class Ingrediente implements Pedido{
	protected double preco;
	protected Pedido pedido;
	
	public Ingrediente(double preco, Pedido pedido) {
		this.preco = preco;
		this.pedido = pedido;
	}
	public abstract double getPreco();
}
