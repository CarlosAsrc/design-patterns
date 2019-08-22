package com.carlosasrc.designpatterns.decorator;

public class Main {
	public static void main(String[] args) {
		Pedido pizza = new Pizza("Bacon dobro de queijo", 20);
		pizza = new Bacon(3.5, pizza);
		pizza = new Queijo(3, pizza);
		pizza = new Queijo(3, pizza);
		System.out.println("Valor da pizza: "+pizza.getPreco());
	}
}
