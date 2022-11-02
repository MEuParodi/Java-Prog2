package Censos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Censos.Filtros.Filtro;

public abstract class Elemento {
	
	private String nombre;
	
	
	public Elemento(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public abstract int getQHab();
	public abstract double getSup();
	public abstract double getIngresos();
	public abstract ArrayList<Comarca> buscar (Filtro f);
	
	public double getIngresosPerCapita() {
		return this.getIngresos()/this.getQHab();
	}
	
	public double getDensidad() {
		return this.getQHab()/this.getSup();
	}
	
	public ArrayList<Comarca> buscarOrdenado(Filtro f, Comparator<Comarca> comp){
		ArrayList<Comarca> lista = this.buscar(f);
		Collections.sort(lista, comp);
		return lista;
	}
		


}
