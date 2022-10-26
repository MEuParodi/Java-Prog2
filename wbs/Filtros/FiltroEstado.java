package wbs.Filtros;

import wbs.ElementoWbs;

public class FiltroEstado extends Filtro {

	private String estadoBuscado;
	
	@Override
	public boolean cumple(ElementoWbs e) {
		return (e.getEstado().equals(estadoBuscado));
	}

}
