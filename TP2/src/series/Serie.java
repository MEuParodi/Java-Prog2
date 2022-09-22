package series;

import java.util.ArrayList;

public class Serie {
	private ArrayList<Temporada> temporadas;
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;


//constructor
	
	public Serie(String titulo, String descripcion, String creador, String genero, ArrayList<Temporada> temps) {
		setTitulo(titulo);
		setDescripcion(descripcion);
		setCreador(creador);
		setGenero(genero);
		setTemporadas(temps);
	}
	
// setters
	
	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas =new ArrayList <Temporada>();
		for (int i=0 ; i < temporadas.size() ; i++) {
			this.temporadas.add(temporadas.get(i));
		}
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setCreador(String creador) {
		this.creador = creador;
	}

	
	//getters
	
	public String getGenero() {
		return genero;
	}
	
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getCreador() {
		return creador;
	}


	// metodos propios

	public int cantEpisodiosVistosSerie() {
		int cont = 0;
		for (Temporada t: temporadas){ //foreach (tipo elemento : nombre_array)
			cont +=  t.cantEpisodiosVistos() ; // de la clase temporada
		}
		return cont;
	}

// Obtener el promedio de las calificaciones dadas para una serie
	
	public float getPromedioCalificacionesSerie() {
		float sumaPromedios = 0;
		for (Temporada t: temporadas){ 
			sumaPromedios +=  t.promCalificacionTemporada();
		}
		return (sumaPromedios/this.getTemporadas().size());
	}
	
}
