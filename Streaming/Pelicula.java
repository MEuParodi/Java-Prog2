package Streaming;

import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private String sinopsis;
	private ArrayList<String> generos;
	private String director;
	private ArrayList<String> actores;
	private int anio;
	private int duracion;
	private Rentable condicion;

	
	public Pelicula(String titulo, String sinopsis, String director, int anio, int duracion, Rentable condicion) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.generos = new ArrayList<>();
		this.director = director;
		this.actores = new ArrayList<>();
		this.anio = anio;
		this.duracion = duracion;
		this.condicion = condicion;
	}
	
	public void setCondicion(Rentable condicion) {
		this.condicion = condicion;
	}
	
	public void setActor(String actor) {
		this.actores.add(actor);
	}
	
	public void setGenero(String genero) {
		this.generos.add(genero);
	}

	public String getTitulo() {
		return titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public boolean tineGenero(String genero) {
		return this.actores.contains(genero);
	}

	public String getDirector() {
		return director;
	}

	public boolean tineActor(String actor) {
		return this.actores.contains(actor);
	}

	public int getAnio() {
		return anio;
	}

	public int getDuracion() {
		return duracion;
	}



	
	
}
