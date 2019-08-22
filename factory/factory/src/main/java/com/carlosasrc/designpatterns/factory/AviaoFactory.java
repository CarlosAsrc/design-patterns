package com.carlosasrc.designpatterns.factory;

public class AviaoFactory {
	public Aviao getAviao(String tipoAviao) {
		switch(tipoAviao) {
			case("MONOMOTOR"):
				return new AviaoMonomotor();
			case("BIMOTOR"): 
				return new AviaoBimotor();
			default: throw new RuntimeException("Deve ser passado um tipo válido de avião (MONOMOTOR | BIMOTOR).");
		}
	}
}
