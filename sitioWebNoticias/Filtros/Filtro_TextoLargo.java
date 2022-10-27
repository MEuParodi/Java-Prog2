package sitioWebNoticias.Filtros;

import sitioWebNoticias.Noticia;

public class Filtro_TextoLargo extends Filtro {

	private int minimo;
	
	public Filtro_TextoLargo(int minimo) {
		this.minimo = minimo;
	}

	@Override
	public boolean cumple (Noticia n) {
		return (n.getTexto().length() > minimo);
	}

}
