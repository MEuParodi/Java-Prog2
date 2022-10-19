 package Futbol5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Futbol5.Filtros.Filtro;

public class Administracion {

	private ArrayList<Socio> socios;
	
	public Administracion() {
		this.socios = new ArrayList<>();
	}

	public void addSocio(Socio socio) {
		if (!socios.contains(socio))
		this.socios.add(socio);
	}
	

	public ArrayList<Socio> buscar (Filtro f){
		ArrayList<Socio> resultado = new ArrayList<>();
		for(Socio s: socios) {
			if (f.cumple(s))
				resultado.add(s);
		}
		return resultado;
	}
	
	
	public ArrayList<Socio> ordenar (ArrayList<Socio> lista, Comparator ComparadorUsado){
		Collections.sort(lista, ComparadorUsado);
		return lista;
	}
	
	
	
	//si quiero puedo usar esta combinada
	public ArrayList<Socio> buscarOrdenado(Filtro f, Comparator ComparadorUsado){
		ArrayList<Socio> resultado = new ArrayList<>();
		for(Socio s: socios) {
			if (f.cumple(s))
				resultado.add(s);
		}
		Collections.sort(resultado, ComparadorUsado);
		return resultado;
	}
		
}
