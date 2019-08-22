package com.carlosasrc.designpatterns.factory.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import  com.carlosasrc.designpatterns.factory.Aviao;
import com.carlosasrc.designpatterns.factory.AviaoBimotor;
import	com.carlosasrc.designpatterns.factory.AviaoFactory;
import com.carlosasrc.designpatterns.factory.AviaoMonomotor;

public class AviaoFactoryTest {
	
	private AviaoFactory aviaoFactory;
	
	@Before public void start (){
		aviaoFactory = new AviaoFactory();
	}
	
	@Test public void getAviaoMonomotorTest() {
		Aviao aviao = aviaoFactory.getAviao("MONOMOTOR");
		boolean aviaoMonomotor = aviao instanceof AviaoMonomotor;
		assertTrue(aviaoMonomotor);
	}
	
	@Test public void getAviaoBimotorTest() {
		Aviao aviao = aviaoFactory.getAviao("BIMOTOR");
		boolean aviaoBimotor = aviao instanceof AviaoBimotor;
		assertTrue(aviaoBimotor);
	}
	
	@Test public void getAviaoMonomotorErradoTest() {
		Aviao aviao = aviaoFactory.getAviao("BIMOTOR");
		boolean aviaoMonomotor = aviao instanceof AviaoMonomotor;
		assertFalse(aviaoMonomotor);
	}
	
	@Test public void getAviaoBimotorErradoTest() {
		Aviao aviao = aviaoFactory.getAviao("MONOMOTOR");
		boolean aviaoBimotor = aviao instanceof AviaoBimotor;
		assertFalse(aviaoBimotor);
	}
	
	@Test (expected = RuntimeException.class) 
	public void getAviaoTipoInvalidoTest() {
		aviaoFactory.getAviao("TIPOINVALIDO");
	}
}
