package sitioWebNoticias.Filtros;

import sitioWebNoticias.Noticia;

public class FiltroOr extends Filtro {

	private Filtro filtro1;
	private Filtro filtro2;
	
	public FiltroOr(Filtro filtro1, Filtro filtro2) {
		this.filtro1 = filtro1;
		this.filtro2 = filtro2;
	}
	
	@Override
	public boolean cumple(Noticia n) {
		return this.filtro1.cumple(n) || this.filtro2.cumple(n);
	}
	

} 
