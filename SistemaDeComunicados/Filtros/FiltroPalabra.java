package SistemaDeComunicados.Filtros;

import SistemaDeComunicados.Empleado;
import SistemaDeComunicados.Noti;

public class FiltroPalabra extends Filtro {
	private String palabraBuscada;

	public FiltroPalabra(String palabraBuscada) {
		this.palabraBuscada = palabraBuscada;
	}

	@Override
	public boolean cumple(Noti n) {
		return (n.tienePalabra(palabraBuscada));
	}

}
