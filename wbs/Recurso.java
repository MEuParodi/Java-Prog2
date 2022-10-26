package wbs;

import java.time.Period;
import java.util.ArrayList;

public class Recurso {

	private ArrayList<ElementoWbs> misTareas; //Elementos donde esta asignado el recurso
	protected String nombre;
	
	public Recurso(String nombre) {
		this.nombre = nombre;
		misTareas = new ArrayList<>();
	}
	
	public boolean esPosibleAsignar (ElementoWbs nueva) {
		for(ElementoWbs e: misTareas) {
			if ( (nueva.getInicio().isAfter(e.getInicio())) && (nueva.getInicio().isBefore(e.getFinEstimado())))
				 return false;
		}
		return true;
	}
	
	
	public void addTarea (ElementoWbs e) {
		if (this.esPosibleAsignar(e))
			this.misTareas.add(e);
	}
	
	public ArrayList<ElementoWbs> getMisTareas(){
		ArrayList<ElementoWbs> copia = new ArrayList<> (misTareas);
		return copia;
	}
}
