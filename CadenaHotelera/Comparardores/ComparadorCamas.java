package Comparardores;

import java.util.Comparator;

import CadenaHotelera.Habitacion;

public class ComparadorCamas implements Comparator<Habitacion> {

	public int compare(Habitacion h1, Habitacion h2) {
		if (h1.getCamas() > h2.getCamas())
			return 1;
		if (h1.getCamas() < h2.getCamas())
			return -1;
		else 
			return 0;
	}

}
