package EmpresaSoftware;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import EmpresaSoftware.Sueldos.Sueldo;

public abstract class Elem {
	
	protected String nombre;
	protected String apellido;
	protected int edad;
	
	
	public Elem(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public abstract ArrayList<String> getEspecialidad();
	
	public abstract int gastoEnSueldos();
	
	public abstract int getCantEmpleados();
	
	public abstract ArrayList<Elem> listar();
	
	public ArrayList<Elem> listarOrdenado (Comparator<Elem> comp){
		ArrayList<Elem> lista = listar();
		Collections.sort(lista, comp);
		return lista;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return (this.getNombre() + " " + this.getApellido());
	}

}
