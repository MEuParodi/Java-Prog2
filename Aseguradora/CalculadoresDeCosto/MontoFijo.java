package Aseguradora.CalculadoresDeCosto;

import Aseguradora.SeguroSimple;

public class MontoFijo extends Costo {

	private double montoFijo;
	
	public MontoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}

	@Override
	public double calcularCosto(SeguroSimple s) {
		return this.montoFijo;
	}

}
