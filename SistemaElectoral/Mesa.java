package SistemaElectoral;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mesa extends Elemento {
	
	private ArrayList<Integer> padron; //trabaja con clases (Integer) mero me deja meterle int
	private ArrayList<Voto> votos;
	
	
	public Mesa() {
		padron = new ArrayList<>();
		votos = new ArrayList<>();
	}
	
	public void addDni(int dni) {
		padron.add(dni); // no hace falta castearlo (boxing/unboxing de java)
	}
	
	public void addVoto(Voto v, int dni) {
		if (this.padron.contains(dni))
			this.votos.add(v);
	}


	@Override
	public double pjeVotosCandidato(Candidato c) {
		int cont = 0;
		for(Voto v: votos)
			if( v.getCandidato().equals(c) )
				cont++;
		return (cont/votos.size()*100);
	}


	@Override
	public int cantVotosEntre(LocalDate inicio, LocalDate fin) {
		int c = 0;
		for(Voto v: votos)
			if( v.getHora().compareTo(inicio) > 0  && (v.getHora().compareTo(fin) < 0) )
				c++;
		return c;
	}


	@Override
	public int cantVotos() {
		return this.votos.size();
	}

}
