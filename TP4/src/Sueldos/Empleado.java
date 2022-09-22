package Sueldos;

public class Empleado{
	protected int legajo;
	protected int sueldo;
	
	public Empleado(int legajo, int sueldo) {
		this.legajo = legajo;
		this.sueldo = sueldo;
	}
	
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	

}
