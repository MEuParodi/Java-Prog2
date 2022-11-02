package Censos.Comparadores;

import java.util.Comparator;

import Censos.Comarca;

public class ComparadorQHabitantes implements Comparator<Comarca> {

	@Override
	public int compare(Comarca c1, Comarca c2) {
		return c1.getQHab()-c2.getQHab();
	}



}
