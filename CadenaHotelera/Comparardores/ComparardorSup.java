package Comparardores;

import java.util.Comparator;

import CadenaHotelera.Habitacion;

public class ComparardorSup implements Comparator<Habitacion> {

	@Override
	public int compare(Habitacion h1, Habitacion h2) {
		if (h1.getSup() > h2.getSup())
			return 1;
		if (h1.getSup() < h2.getSup())
			return -1;
		else 
			return 0;
	}

}
