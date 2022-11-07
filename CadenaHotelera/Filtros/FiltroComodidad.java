package CadenaHotelera.Filtros;

import CadenaHotelera.Habitacion;

public class FiltroComodidad extends Filtro {

	private String comodBuscada;
	
	public FiltroComodidad(String comodBuscada) {
		this.comodBuscada = comodBuscada;
	}

	@Override
	public boolean cumple(Habitacion h) {
		return h.tieneComodidad(comodBuscada);
	}

}
