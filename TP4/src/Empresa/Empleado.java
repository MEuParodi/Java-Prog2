package Empresa;

public class Empleado extends Persona {
	protected int legajo;
	protected double sueldo;
	
	public Empleado(String nombre, String apellido, int edad, String cargo, int legajo, double sueldo) {
		super(nombre, apellido, edad, cargo);
		this.legajo = legajo;
		this.sueldo = sueldo;
	}

	public int getLegajo() {return legajo;}
	public void setLegajo(int legajo) {this.legajo = legajo;}
	
	public double getSueldo() {return sueldo;}
	public void setSueldo(double sueldo) {this.sueldo = sueldo;}

	public String getCargo() {return cargo;}
	
	
	
	

}
