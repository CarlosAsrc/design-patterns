package com.carlosasrc.designpatterns.builder;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private LocalDate nascimento;
	private Endereco endereco;
	
	public Pessoa() {}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nascimento=" + nascimento + ", endereco=" + endereco + "]";
	}
}
