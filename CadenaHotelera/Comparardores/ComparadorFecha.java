package Comparardores;

import java.util.Comparator;

import CadenaHotelera.Habitacion;

public class ComparadorFecha implements Comparator<Habitacion>{

	@Override
	public int compare(Habitacion h1, Habitacion h2) {
		return h1.getFechaOcup().compareTo(h2.getFechaOcup());
	}



}
