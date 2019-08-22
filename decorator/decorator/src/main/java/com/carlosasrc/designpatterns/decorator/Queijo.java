package com.carlosasrc.designpatterns.decorator;

public class Queijo extends Ingrediente{

	public Queijo(double preco, Pedido pedido) {
		super(preco, pedido);
	}

	@Override
	public double getPreco() {
		return this.preco + pedido.getPreco();
	}
}
