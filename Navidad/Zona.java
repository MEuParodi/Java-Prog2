package SistemaElectoral;

import java.time.LocalDate;
import java.util.ArrayList;

public class Zona extends Elemento {
	private ArrayList<Elemento> elementos;
	
	public Zona() {
		elementos = new ArrayList<>();
	}

	
	public void add(Elemento elemento) {
		this.elementos.add(elemento);
	}
	
	
	@Override
	public double pjeVotosCandidato(Candidato c) { /// ver como hacer matematicamente
		int pj = 0;
			for(Elemento e : elementos)
				  pj += e.pjeVotosCandidato(c) * e.cantVotos()/this.cantVotos();
		return (pj);
	}

	@Override
	public int cantVotosEntre(LocalDate inicio, LocalDate fin) {
		int cont = 0;
		for(Elemento e: elementos)
			cont += e.cantVotosEntre(inicio, fin);
		return cont;
	}

	@Override
	public int cantVotos() {
		int cant = 0;
		for(Elemento e: elementos)
			cant += e.cantVotos();
		return cant;
	}

}
