package SistemaElectoral.Comparadores;

import java.util.Comparator;

import SistemaElectoral.Candidato;

public class Comparador_Compuesto implements Comparator<Candidato>{
	
	private Comparator comp1;
	private Comparator comp2;


	public Comparador_Compuesto(Comparator comp1, Comparator comp2) {
		this.comp1 = comp1;
		this.comp2 = comp2;
	}


	@Override
	public int compare(Candidato o1, Candidato o2) {
		if ( comp1.compare(o1, o2) == 0 )
			return (comp2.compare(o1, o2));
	}

}
