package Futbol5.Comparadores;

import java.util.Comparator;

import Futbol5.Socio;

public class ComparadorTotalAlquileres implements Comparator<Socio>{
	private int nroCancha;
	
	public ComparadorTotalAlquileres (int nroCancha) {
		this.nroCancha = nroCancha;
	}
	
	@Override
	public int compare(Socio s1, Socio s2) {
		return s1.cantAlqCancha(nroCancha) - s2.cantAlqCancha(nroCancha);
	}

}
