package com.carlosasrc.designpatterns.decorator.test;

import com.carlosasrc.designpatterns.decorator.Pedido;
import com.carlosasrc.designpatterns.decorator.Pizza;
import com.carlosasrc.designpatterns.decorator.Queijo;
import org.junit.Test;

import com.carlosasrc.designpatterns.decorator.Bacon;

import static org.junit.Assert.*;

public class PedidoTest {
	@Test
	public void pizzaTest() {
		Pedido pedido = new Pizza("Pizza normal", 20);
		assertEquals(20, pedido.getPreco(), 0);
	}
	
	@Test
	public void pizzaBaconTest() {
		Pedido pedido = new Pizza("Pizza normal", 20);
		pedido = new Bacon(3.5, pedido);
		assertEquals(23.5, pedido.getPreco(), 0);
	}
	
	@Test
	public void pizzaQueijoTest() {
		Pedido pedido = new Pizza("Pizza normal", 20);
		pedido = new Queijo(3, pedido);
		assertEquals(23, pedido.getPreco(), 0);
	}
	
	@Test
	public void pizzaQueijoEBaconTest() {
		Pedido pedido = new Pizza("Pizza normal", 20);
		pedido = new Bacon(3.5, pedido);
		pedido = new Queijo(3, pedido);
		assertEquals(26.5, pedido.getPreco(), 0);
	}
}
