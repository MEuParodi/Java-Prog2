package Censos.Filtros;

import Censos.Comarca;

public class FiltroHabitantes extends Filtro {
	private int minHabb;
	
	public FiltroHabitantes(int minHabb) {
		this.minHabb = minHabb;
	}

	@Override
	public boolean cumple(Comarca c) {
		return c.getQHab()>this.minHabb;
	}

}
