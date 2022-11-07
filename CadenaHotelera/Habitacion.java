package CadenaHotelera;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import CadenaHotelera.Filtros.Filtro;

public class Habitacion extends ElementoAbstracto{

	private ArrayList <String> comodidades;
	private double sup;
	private int camas;
	private LocalDate fechaOcup;
	private boolean mascotas;
	
	
	public Habitacion(Comparator<Habitacion> comp, double sup, int camas, LocalDate fechaOcup, boolean mascotas) {
		super(comp);
		this.sup = sup;
		this.camas = camas;
		this.fechaOcup = fechaOcup;
		this.mascotas = mascotas;
		this.comodidades = new ArrayList<>();
	}
	
	public void agregarComodidad(String c) {
		if (!this.comodidades.contains(c))
			this.comodidades.add(c);
	}
	
	public boolean estaLibre() {
		return (this.fechaOcup.isBefore(LocalDate.now()));
	}
	
	public boolean tieneComodidad(String c) {
		return this.comodidades.contains(c);
	}

	public double getSup() {
		return sup;
	}

	public int getCamas() {
		return camas;
	}

	public LocalDate getFechaOcup() {
		return fechaOcup;
	}

	public boolean aceptaMascotas() {
		return mascotas;
	}

	public void setSup(double sup) {
		this.sup = sup;
	}

	public void setCamas(int camas) {
		this.camas = camas;
	}

	public void setFechaOcup(LocalDate fechaOcup) {
		this.fechaOcup = fechaOcup;
	}

	public void setMascotas(boolean mascotas) {
		this.mascotas = mascotas;
	}

	@Override
	public ArrayList<Habitacion> buscar(Filtro f) {
		ArrayList<Habitacion> lista = new ArrayList<>();
		if (f.cumple(this) && this.estaLibre())
			lista.add(this);
		return lista;
	}

	@Override
	public double getdimension() {
		return this.sup;
	}
	
	@Override
	public int cantidadHabLibres(Filtro f) {
		if (f.cumple(this))
			return 1;
		else
			return 0;
	}

	@Override
	public int cantidadHabLibres() {
		if (this.estaLibre())
			return 1;
		else
			return 0;
	}

	
}
