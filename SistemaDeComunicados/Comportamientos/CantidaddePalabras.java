package SistemaDeComunicados.Comportamientos;

import SistemaDeComunicados.Noti;

public class CantidaddePalabras extends Comportamiento {
	

	private int maximaCantidad;
	

	public CantidaddePalabras(int maximaCantidad) {
		this.maximaCantidad = maximaCantidad;
	}


	@Override
	public boolean sePropaga(Noti mensaje) {
		return mensaje.getCantPalabras() <= this.maximaCantidad;
	}

}
