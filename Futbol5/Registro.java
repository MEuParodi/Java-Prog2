package Futbol5;

import java.time.LocalDate;

public class Registro {
	private LocalDate fecha;
	private int idCancha;
	private double precio;
	
	public Registro(LocalDate fecha, int idCancha, double precio) {
		this.fecha = fecha;
		this.idCancha = idCancha;
		this.precio = precio;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getPrecio() {
		return precio;
	}

	public int getIdCancha() {
		return this.idCancha;
	}

}
