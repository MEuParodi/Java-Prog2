package Futbol5.Comparadores;

import java.util.Comparator;
import Futbol5.Socio;

public class ComparadorEdad implements Comparator<Socio> {
	
	@Override
	public int compare(Socio s1, Socio s2) {
		return s1.getEdad()-s2.getEdad();
	}

}
