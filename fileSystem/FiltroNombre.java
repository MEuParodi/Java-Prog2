package fileSystem;


public class FiltroNombre extends Filtro {
	private String nombreBuscado;
	
	public FiltroNombre(String nombreBuscado) {
		this.nombreBuscado = nombreBuscado;
	}

	@Override
	public boolean cumple(Elemento e) {
		return (e.getNombre().contains(nombreBuscado));
	}


}
