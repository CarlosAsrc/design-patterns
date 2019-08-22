package com.carlosasrc.designpatterns.decorator;

public class Pizza implements Pedido{
	private String nome;
	private double preco;
	
	public Pizza(String nome, int preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
