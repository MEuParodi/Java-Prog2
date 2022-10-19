package Futbol5.Filtros;

import Futbol5.Socio;

public class FiltroEsMenor extends Filtro  {
	private int edadMaxima;

	public FiltroEsMenor(int edadMaxima) {
		this.edadMaxima = edadMaxima;
	}
	
	@Override
	public boolean cumple(Socio socio) {
		return socio.getEdad()< this.edadMaxima;
	}

}
