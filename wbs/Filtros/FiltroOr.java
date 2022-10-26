package wbs.Filtros;

import wbs.ElementoWbs;

public class FiltroOr extends Filtro {

	private Filtro f1;
	private Filtro f2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	@Override
	public boolean cumple(ElementoWbs e) {
		return this.f1.cumple(e) || this.f2.cumple(e);
	}

}
