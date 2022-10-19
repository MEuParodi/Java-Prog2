package SistemaElectoral.Comparadores;

import java.util.Comparator;

import SistemaElectoral.Candidato;

public class Comparador_Nombre implements Comparator<Candidato>{


	@Override
	public int compare(Candidato o1, Candidato o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
