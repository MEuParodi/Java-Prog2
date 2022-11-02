package Censos.Comparadores;

import java.util.Comparator;

import Censos.Comarca;

public class ComparadorIngresos implements Comparator<Comarca> {

	@Override
	public int compare(Comarca c1, Comarca c2) {
		return (int) (c1.getIngresos()-c2.getIngresos());
	}



}
