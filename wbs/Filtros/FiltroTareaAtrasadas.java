package wbs.Filtros;

import java.time.LocalDate;

import wbs.ElementoWbs;

public class FiltroTareaAtrasadas extends Filtro {


	@Override
	public boolean cumple(ElementoWbs e) {
		return (e.getFinEstimado().isAfter(LocalDate.now()));
	}

}
