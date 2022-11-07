package CadenaHotelera.Filtros;

import CadenaHotelera.Habitacion;

public class FiltroCamas extends Filtro {

private int camasDeseadas;
	
	public FiltroCamas(int camasDeseadas) {
		this.camasDeseadas = camasDeseadas;
	}

	@Override
	public boolean cumple(Habitacion h) {
		return h.getCamas()>= this.camasDeseadas;
	}

}
