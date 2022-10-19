package Streaming;

public class FxDirector extends Filtro {
	private String directorBuscado;

	public FxDirector(String directorBuscado) {
		this.directorBuscado = directorBuscado;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return p.getDirector().equals(directorBuscado);
	}

}
