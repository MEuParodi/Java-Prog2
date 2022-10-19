package Futbol5.Filtros;

import Futbol5.Socio;

public class FiltroNot extends Filtro {
	
	private Filtro f;

	public FiltroNot(Filtro f) {
		this.f = f;

	}

	@Override
	public boolean cumple(Socio socio) {
		return (!this.f.cumple(socio));
	}

}
