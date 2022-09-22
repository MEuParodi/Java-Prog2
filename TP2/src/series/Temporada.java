package series;

import java.util.ArrayList; // import the ArrayList class --- ArrayList<String> cars = new ArrayList<String>()

// la clase Temporada tiene un array con los objetos episodios 

public class Temporada {
	private ArrayList<Episodio> episodios;
	private int nroTemporada;

	// ArrayList<Tipo> nombre = new ArrayList<Tipo>()
	
	public Temporada(Episodio episodio, int nroTemporada) {
		this.episodios = new ArrayList<Episodio>(); //creo un arrayList vacio 
		setEpisodios(episodio); //para que llene el array
		this.nroTemporada = nroTemporada;
	}
	
	
	public void setEpisodios(Episodio espisodio) {
		this.episodios.add(espisodio); // agerga un elemento al arraylist
	}
	
	public int getNumeroTemporada() {
		  return this.nroTemporada;
	}
	
	public int getCantEpisodios() {
		  return this.episodios.size();
	}
	
	public ArrayList<Episodio> getEpisodios() {
		return this.episodios;
	}
	  
	  
	public int cantEpisodiosVistos() {
		int cont = 0 ;
		if (episodios.size()!= 0) {
			for (int i = 0 ; i < episodios.size() ; i++){
				if(episodios.get(i).getFueVisto()) // es de la clase Episodio 
					cont ++;
			}
		}
		return cont;
	}
	

	public double promCalificacionTemporada() {
		int suma=0, cont= 0;
		for (Episodio e: episodios){
			if(e.getFueVisto()) { 			
				suma += e.getCalificacion();  
				cont ++;
			}
		}
		return (suma/cont);
	}

}
