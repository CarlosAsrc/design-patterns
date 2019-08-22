package com.carlosasrc.designpatterns.builder;

import java.time.LocalDate;

public class PessoaBuilder {
	private Pessoa pessoa;
	
	public static PessoaBuilder builder() {
		return new PessoaBuilder();
	}
	
	public PessoaBuilder() {
		this.pessoa = new Pessoa();
	}
	
	public PessoaBuilder comNome(String nome) {
		this.pessoa.setNome(nome);
		return this;
	}
	
	public PessoaBuilder comNascimento(LocalDate nascimento) {
		this.pessoa.setNascimento(nascimento);
		return this;
	}
	
	public PessoaBuilder comEndereco(String rua, int numero, String cidade, String estado) {
		Endereco endereco = new Endereco();
		endereco.setRua(rua);
		endereco.setNumero(numero);
		endereco.setCidade(cidade);
		endereco.setEstado(estado);
		this.pessoa.setEndereco(endereco);
		return this;
	}
	
	public Pessoa build() {
		return this.pessoa;
	}
	
}
