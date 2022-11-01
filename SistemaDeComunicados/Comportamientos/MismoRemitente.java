package SistemaDeComunicados.Comportamientos;

import SistemaDeComunicados.Noti;

public class MismoRemitente extends Comportamiento {
	

	private String remitente;
	

	public MismoRemitente(String remitente) {
		this.remitente = remitente;
	}


	@Override
	public boolean sePropaga(Noti mensaje) {
		return mensaje.getRemitente().equals(remitente);
	}

}
