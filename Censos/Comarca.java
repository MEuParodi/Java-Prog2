package Censos;

import java.util.ArrayList;
import java.util.Comparator;

import Censos.Filtros.Filtro;

public class Comarca extends Elemento {
	private double sup;
	private int qHabs;
	private double ingresos;
	
	public Comarca(String nombre, double sup, int qHabs, double ingresos) {
		super(nombre);
		this.sup = sup;
		this.qHabs = qHabs;
		this.ingresos = ingresos;
	}
	
	public void setSup(double sup) {
		this.sup = sup;
	}

	public void setQHab(int qHabs) {
		this.qHabs = qHabs;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}



	@Override
	public int getQHab() {
		return this.getQHab();
	}

	@Override
	public double getSup() {
		return this.sup;
	}

	@Override
	public ArrayList<Comarca> buscar(Filtro f) {
		ArrayList<Comarca> lista = new ArrayList<>();
		if (f.cumple(this))
			lista.add(this);
		return lista;

	}
	

	@Override
	public double getIngresos() {
		return this.ingresos;
		
	}



	
		
}
