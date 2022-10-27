package sitioWebNoticias.Filtros;

import sitioWebNoticias.Noticia;

public class Filtro_Autor extends Filtro {

	private String autorBuscado;
	
	public Filtro_Autor(String autorBuscado) {
		this.autorBuscado = autorBuscado;
	}

	@Override
	public boolean cumple (Noticia n) {
		return (n.getAutor().equals(autorBuscado));
	}

}
