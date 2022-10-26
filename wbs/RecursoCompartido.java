package wbs;

import java.util.ArrayList;

public class RecursoCompartido extends Recurso {

	public RecursoCompartido(String nombre) {
		super(nombre);
	}

	
	public boolean esPosibleAsignar (ElementoWbs nueva) {
		return true;
	}
	
}
