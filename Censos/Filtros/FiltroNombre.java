package Censos.Filtros;

import Censos.Comarca;

public class FiltroNombre extends Filtro {
	private String nombreBuscado;
	
	public FiltroNombre(String nombreBuscado) {
		this.nombreBuscado = nombreBuscado;
	}

	@Override
	public boolean cumple(Comarca c) {
		return c.getNombre().equals(nombreBuscado);
	}

}
