package SistemaElectoral;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Elemento {
	
	
	protected ArrayList<Candidato> candidatos; 
	
	public Elemento() {
		candidatos  = new ArrayList<>();
	}
	
	public abstract double pjeVotosCandidato(Candidato c); // al de votos en blanco aca le mando null como parametro
	
	public abstract int cantVotosEntre(LocalDate inicio, LocalDate fin);
	
	public abstract int cantVotos();
	
	public ArrayList<Candidato> listarOrdenado(Comparator comp){
		ArrayList<Candidato> lista = new ArrayList<>(candidatos);
		Collections.sort(lista, comp);
		return lista;
	}
	
	
	
	

}
