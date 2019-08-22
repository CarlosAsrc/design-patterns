package com.carlosasrc.designpatterns.builder.test;

import org.junit.Test;

import com.carlosasrc.designpatterns.builder.Pessoa;
import com.carlosasrc.designpatterns.builder.PessoaBuilder;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

public class PessoaBuilderTest {
    @Test
    public void createPessoaTest() {
    	Pessoa pessoa = new PessoaBuilder().build();
    	boolean criacao = pessoa instanceof Pessoa;
    	assertTrue(criacao);
    }
    
    @Test
    public void createPessoaComNomeTest() {
    	String nome = "Carlos";
    	Pessoa pessoa = new PessoaBuilder()
    					.comNome(nome)
    					.build();
    	assertEquals(nome, pessoa.getNome());
    }
    
    @Test
    public void createPessoaComNascimentoTest() {
    	LocalDate nascimento = LocalDate.of(1999, Month.APRIL, 27);
    	Pessoa pessoa = new PessoaBuilder()
    					.comNascimento(nascimento)
    					.build();
    	assertEquals(nascimento, pessoa.getNascimento());
    }
    
    @Test
    public void createPessoaComEnderecoTest() {
    	String rua = "Rua 52";
    	int numero = 5200;
    	String cidade = "Anápolis";
    	String estado = "GO";
    	Pessoa pessoa = new PessoaBuilder()
    					.comEndereco(rua, numero, cidade, estado)
    					.build();
    	assertEquals(rua, pessoa.getEndereco().getRua());
    	assertEquals(numero, pessoa.getEndereco().getNumero());
    	assertEquals(cidade, pessoa.getEndereco().getCidade());
    	assertEquals(estado, pessoa.getEndereco().getEstado());
    }
}
