package Streaming;

public class FxTitulo extends Filtro {
	private String tituloBuscado;
	
	
	public FxTitulo(String tituloBuscado) {
		this.tituloBuscado = tituloBuscado;
	}


	@Override
	public boolean cumple (Pelicula p) {
		return p.getTitulo().contains(tituloBuscado);
	}
}

