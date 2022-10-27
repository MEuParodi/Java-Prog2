package sitioWebNoticias.Filtros;

import sitioWebNoticias.Noticia;

public class FiltroAnd extends Filtro {

	private Filtro f1;
	private Filtro f2;
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(Noticia n) {
		return (this.f1.cumple(n) && this.f2.cumple(n));
	}

}
