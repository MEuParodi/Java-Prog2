package Censos.Filtros;

import Censos.Comarca;

public class FiltroDensidad extends Filtro {
	private double DensidadMin;
	
	public FiltroDensidad(double DensidadMin) {
		this.DensidadMin = DensidadMin;
	}

	@Override
	public boolean cumple(Comarca c) {
		return c.getDensidad()>this.DensidadMin;
	}

}
