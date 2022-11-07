package CadenaHotelera.Filtros;

import CadenaHotelera.Habitacion;

public class FiltroTamanio extends Filtro {

private double tamBuscado;
	
	public FiltroTamanio(double tamBuscado) {
		this.tamBuscado = tamBuscado;
	}
	
	@Override
	public boolean cumple(Habitacion h) {
		return h.getSup()>= this.tamBuscado;
	}

}
