package Streaming;

public class FxGenero extends Filtro {
	private String generoBuscado;
	
	public FxGenero(String generoBuscado) {
		this.generoBuscado = generoBuscado;
	}


	@Override
	public boolean cumple(Pelicula p) {
		return p.tineGenero(generoBuscado);
	}

}
