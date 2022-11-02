package Aseguradora.Filtros;

import Aseguradora.SeguroSimple;

public class FiltroPalabra extends Filtro {

	private String palabraBuscada;
	

	public FiltroPalabra(String palabraBuscada) {
		this.palabraBuscada = palabraBuscada;
	}


	@Override
	public boolean cumple(SeguroSimple s) {
		return (s.getDescr().contains(palabraBuscada));
	}

}
