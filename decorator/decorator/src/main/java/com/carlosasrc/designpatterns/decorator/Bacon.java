package com.carlosasrc.designpatterns.decorator;

public class Bacon extends Ingrediente{

	public Bacon(double preco, Pedido pedido) {
		super(preco, pedido);
	}

	@Override
	public double getPreco() {
		return this.preco + pedido.getPreco();
	}
}
