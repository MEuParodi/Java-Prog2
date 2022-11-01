package SistemaDeComunicados.Comportamientos;

import SistemaDeComunicados.Noti;

public class ContienePalabra extends Comportamiento {
	

	private String palabra;
	

	public ContienePalabra(String palabra) {
		this.palabra = palabra;
	}


	@Override
	public boolean sePropaga(Noti mensaje) {
		return mensaje.tienePalabra(palabra);
	}

}
