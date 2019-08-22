package com.carlosasrc.designpatterns.templatemetohd.test;

import org.junit.Test;

import com.carlosasrc.designpatterns.templatemetohd.MaquinaDeCafe;
import com.carlosasrc.designpatterns.templatemetohd.MaquinaDeCha;

import static org.junit.Assert.*;

public class MaquinaDeBebidasTest {
    @Test public void prepararCafeTest() {
    	MaquinaDeCafe maquina = new MaquinaDeCafe();
    	maquina.preparar();
    	assertTrue(maquina.getBebida().isServido());
    }
    
    @Test public void prepararChaTest() {
    	MaquinaDeCha maquina = new MaquinaDeCha();
    	maquina.preparar();
    	assertTrue(maquina.getBebida().isServido());
    }
    
    @Test public void prepararCafeFalhaTest() {
    	MaquinaDeCafe maquina = new MaquinaDeCafe();
    	assertFalse(maquina.getBebida().isServido());
    }
    
    @Test public void prepararChaFalhaTest() {
    	MaquinaDeCha maquina = new MaquinaDeCha();
    	assertFalse(maquina.getBebida().isServido());
    }
}
