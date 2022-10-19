package Futbol5.Filtros;

import Futbol5.Socio;

public class AlquiloCancha extends Filtro {

	private int idCanchaBuscada;
	public AlquiloCancha(int idCanchaBuscada) {
		this.idCanchaBuscada = idCanchaBuscada;
	}

	@Override
	public boolean cumple(Socio socio) {
		return socio.AlqCancha(idCanchaBuscada);
	}

}
