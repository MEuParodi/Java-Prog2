package Aseguradora.Filtros;

import Aseguradora.SeguroSimple;

public class FiltroMonto extends Filtro {

	private double montoBase;
	

	public FiltroMonto(double montoBase) {
		this.montoBase = montoBase;
	}


	@Override
	public boolean cumple(SeguroSimple s) {
		return s.getMonto()>this.montoBase;
	}

}
