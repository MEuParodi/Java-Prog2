package Aseguradora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Aseguradora.CalculadoresDeCosto.Costo;
import Aseguradora.Filtros.Filtro;

public abstract class Seguro {
	
	protected int dni;
	
	
	public Seguro (int dni) {
		this.dni = dni;
		
	}

	public abstract int getNumero();
	
	public abstract double getMonto() ;

	public abstract int getDni();

	public abstract double getCosto();
	
	public abstract ArrayList<SeguroSimple> buscar (Filtro f);
	
	public ArrayList<SeguroSimple> buscarOrdenado (Filtro f, Comparator<SeguroSimple> comp){
		ArrayList<SeguroSimple> resultado = this.buscar(f);
		Collections.sort(resultado, comp);
		return resultado;
	}
	

}
