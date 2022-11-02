package Aseguradora.Filtros;

import Aseguradora.SeguroSimple;

public class FiltroDNI extends Filtro {

	private int dniBuscado;
	

	public FiltroDNI(int dniBuscado) {
		this.dniBuscado = dniBuscado;
	}


	@Override
	public boolean cumple(SeguroSimple s) {
		return s.getDni() == this.dniBuscado;
	}

}
