package wbs.Filtros;

import wbs.ElementoWbs;

public class FiltroNot extends Filtro {

	private Filtro filtro;
	
	public FiltroNot(Filtro filtro) {
		this.filtro = filtro;
	}
	
	@Override
	public boolean cumple(ElementoWbs e) {
		return ! this.filtro.cumple(e);
	}

}
