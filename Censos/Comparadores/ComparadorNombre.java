package Censos.Comparadores;

import java.util.Comparator;

import Censos.Comarca;

public class ComparadorNombre implements Comparator<Comarca>{

	@Override
	public int compare(Comarca c1, Comarca c2) {
		return c1.getNombre().compareTo(c2.getNombre());
	}

}
