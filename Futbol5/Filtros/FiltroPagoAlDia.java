package Futbol5.Filtros;

import Futbol5.Socio;

public class FiltroPagoAlDia extends Filtro {

	@Override
	public boolean cumple(Socio socio) {
		return socio.tengoPagoAlDia();
	}

}
