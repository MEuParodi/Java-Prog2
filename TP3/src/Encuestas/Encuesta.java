package Encuestas;

import java.util.ArrayList;

public class Encuesta {
	private int id;
	private ArrayList<String> preguntas;
	
	//constructor
	public Encuesta(int id, ArrayList<String> preguntas) {
		setId(id);
		this.preguntas = new ArrayList<String>();
		for (String p: preguntas)
			setPregunta(p);
	}
	
	//setters
	public void setId(int id) {
		this.id= id; // podria comprobar que el id no este repetido
	}
	
	public void setPregunta(String pregunta) {
		this.preguntas.add(pregunta);
	}
	
	//getters
	public int getId() {
		return this.id;
	}
	//devuelvo una copia del array
	public ArrayList<String> getPreguntas() {
		return new ArrayList<>(preguntas);
	}
	
	@Override
	public boolean equals(Object o) {
		Encuesta encuesta = (Encuesta) o;
		return(this.getId() == encuesta.getId());
	}
	
	@Override
	public String toString() {
		return ("id: " + this.getId() + " preguntas: " + this.getPreguntas());
	}
	
	
}
