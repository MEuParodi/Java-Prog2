package Encuestas;

public class Empleado {
	private int legajo;
	private int QEncuestas;
	
	public Empleado(int legajo) {
			this.legajo = legajo;
			this.QEncuestas = 0;
	}
	
	public int getLegajo() {
		return this.legajo;
	}
	
	public void incrementarEncuestas() {
		this.QEncuestas ++;
	}
	
	public int getQEncuestasR() {
		return this.QEncuestas;
	}

	@Override
	public boolean equals(Object o) {
		Empleado emp = (Empleado) o;
		return (emp.getLegajo() == this.legajo);
	}

	@Override
	public String toString() {
		return ("Empleado con legajo:  " + this.getLegajo() + "  ");
	}
	
	
}
