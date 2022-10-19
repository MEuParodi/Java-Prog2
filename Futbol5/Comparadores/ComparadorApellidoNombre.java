package Futbol5.Comparadores;

import java.util.Comparator;

import Futbol5.Socio;

public class ComparadorApellidoNombre implements Comparator<Socio>{

	@Override
	public int compare(Socio s1, Socio s2) {
		int resultado = s2.getApellido().compareTo(s1.getApellido()) ;
		if (resultado == 0)
			resultado = s2.getNombre().compareTo(s1.getNombre());
		return resultado;
	}

}
