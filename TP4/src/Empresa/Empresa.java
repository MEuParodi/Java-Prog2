package Empresa;

import java.util.ArrayList;

public class Empresa {
	ArrayList<Persona> empleados;
	
	public Empresa() {
		empleados = new ArrayList<Persona>();
	}
	
	public void cargarEmpleado(Persona p) {
		empleados.add(p);
	}
	
	public String MostrarListaDeEmpleados() {
		String cadena = "";
		for(Persona e: empleados) {
			cadena += "\n cargo: " + e.getCargo() +"  "+ e.getNombre() +" "+ e.getApellido() +" edad: "+ e.getEdad();
		}
		return cadena;
	}

}
