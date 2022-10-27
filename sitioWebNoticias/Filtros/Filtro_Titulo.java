package sitioWebNoticias.Filtros;

import sitioWebNoticias.Noticia;

public class Filtro_Titulo extends Filtro {

	private String tituloBuscado;
	
	public Filtro_Titulo(String tituloBuscado) {
		this.tituloBuscado = tituloBuscado;
	}

	@Override
	public boolean cumple (Noticia n) {
		return (n.getTitulo().equals(tituloBuscado));
	}

}
