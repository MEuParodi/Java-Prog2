package Empresa;

import java.util.ArrayList;

public class Jerarquico extends Empleado{
	private ArrayList<Persona> empleadosACargo;
	
	public Jerarquico(String nombre, String apellido, int edad, String cargo, int legajo, double sueldo) {
		super(nombre, apellido, edad, cargo, legajo, sueldo);
		empleadosACargo = new ArrayList<Persona>();
	} 
	
	public void setPersonaACargo(Persona p) {
		empleadosACargo.add(p);
	}


}
