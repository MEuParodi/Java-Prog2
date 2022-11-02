package Aseguradora.CalculadoresDeCosto;

import Aseguradora.SeguroSimple;

public class Porcentaje extends Costo {

	private double porcentaje;
	
	public Porcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public double calcularCosto(SeguroSimple s) {
		return this.porcentaje/100 * s.getMonto();
	}

}
