package sitioWebNoticias.Filtros;

import sitioWebNoticias.Noticia;

public class Filtro_PalabraClave extends Filtro {

	private String palabraBuscada;
	
	public Filtro_PalabraClave(String palabraBuscada) {
		this.palabraBuscada = palabraBuscada;
	}

	@Override
	public boolean cumple (Noticia n) {
		return (n.tienePClave(palabraBuscada));
	}

}
