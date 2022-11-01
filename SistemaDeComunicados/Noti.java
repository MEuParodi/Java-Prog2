package SistemaDeComunicados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Noti {
	private ArrayList<String> palabras;
	private String remitente;
	private LocalDate fecha;
	
	public Noti(String remitente, LocalDate fecha) {
		this.remitente = remitente;
		this.fecha =fecha;
		this.palabras = new ArrayList<>();
	}

	public void addPalabra(String p) {
		this.palabras.add(p);
	}
	
	public String getRemitente() {
		return this.remitente;
	}
	
	private Object getFecha() {
		return this.fecha;
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Noti otra = (Noti) o;
			return(otra.getRemitente().equals(this.getRemitente()) && otra.getFecha().equals(this.getFecha())) && Objects.equals(otra, this);
		
		}catch (Exception exc) {
			return false;
		}
	}

	public boolean tienePalabra(String palabra) {
			return (this.palabras.contains(palabra));
	}

	public int getCantPalabras() {
		return this.palabras.size();
	}


}
