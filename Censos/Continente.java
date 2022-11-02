package Censos;

import java.util.ArrayList;

import Censos.Filtros.Filtro;

public class Continente extends Elemento {

	private ArrayList<Elemento> elementos;
	
	public Continente(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(Elemento e) {
		this.elementos.add(e);
	}

	@Override
	public int getQHab() {
		int cant = 0;
		for (Elemento e: elementos)
			cant += e.getQHab();
		return cant;
	}


	@Override
	public double getSup() {
		int sup = 0;
		for (Elemento e: elementos)
			sup += e.getSup();
		return sup;
	}

	@Override
	public double getIngresos() {
		int ing = 0;
		for (Elemento e: elementos)
			ing += e.getIngresos();
		return ing;
	}


	@Override
	public ArrayList<Comarca> buscar(Filtro f) {
		ArrayList<Comarca> lista = new ArrayList<>();
		for (Elemento e: elementos) {
			ArrayList<Comarca> listaHijos = e.buscar(f);
			lista.addAll(listaHijos);
		}
		return lista;
	}


}
