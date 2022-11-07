package CadenaHotelera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import CadenaHotelera.Filtros.Filtro;

public abstract class ElementoAbstracto {
	protected Comparator<Habitacion> comp;
	
	public ElementoAbstracto(Comparator<Habitacion> comp) {
		this.comp = comp;
	}
	
		
	
	public void setComparador (Comparator comp) {
		this.comp = comp;
	}
	
	public Comparator<Habitacion> getComparador() {
		return comp;
	}
	
	public abstract ArrayList<Habitacion> buscar(Filtro f);
	
	public abstract double getdimension();
	
	public abstract int cantidadHabLibres();
	
	public abstract int cantidadHabLibres(Filtro f);
	
	public ArrayList<Habitacion> buscarOredenado (Filtro f, Comparator comp){
		ArrayList<Habitacion> lista = this.buscar(f);
		Collections.sort(lista, comp);
		return lista;
	}
	
	
}
