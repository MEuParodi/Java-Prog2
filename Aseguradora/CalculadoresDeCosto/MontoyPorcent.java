package Aseguradora.CalculadoresDeCosto;

import Aseguradora.SeguroSimple;

public class MontoyPorcent extends Costo {

	private Costo c1;
	private Costo c2;
	
	
	public MontoyPorcent(Costo c1, Costo c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public double calcularCosto(SeguroSimple s) {
		return c1.calcularCosto(s) + c2.calcularCosto(s);
	}

}
