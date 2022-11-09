package EmpresaSoftware;
import java.util.ArrayList;

import EmpresaSoftware.Sueldos.Sueldo;

public class Prog extends Elem {
	
	private ArrayList<String> especialidades;
	private int cantHorasExtras;
	private int cantHorasMensuales;
	protected Sueldo s; //comportamiento para calcular el sueldo

	public Prog(String nombre, String apellido, int edad, Sueldo s, int cantHorasMensuales ) {
		super(nombre, apellido, edad);
		this.s = s;
		this.cantHorasExtras = 0;
		this.cantHorasMensuales = cantHorasMensuales;
	}

	
	public void setSueldo(Sueldo s) {
		this.s = s;
	}
	
	public void agregarHorasExtras(int cant) {
		this.cantHorasExtras += cant;
	}
	
		@Override
	public ArrayList<String> getEspecialidad() {
		return new ArrayList<String> (especialidades);
	}

	@Override
	public int gastoEnSueldos() {
		return this.getSueldo(s);
	}

	private int getSueldo(Sueldo s) {
		return s.calcularSueldo(this);
	}

	@Override
	public int getCantEmpleados() {
		return 1;
	}

	@Override
	public ArrayList<Elem> listar() {
		ArrayList<Elem> lista = new ArrayList<>();
		lista.add(this);
		return lista;
	}

	public ArrayList<String> getEspecialidades() {
		return especialidades;
	}

	public int getCantHorasExtras() {
		return cantHorasExtras;
	}

	public int getCantHorasMensuales() {
		return cantHorasMensuales;
	}

	public void setCantHorasMensuales(int cantHorasMensuales) {
		this.cantHorasMensuales = cantHorasMensuales;
	}
	

}
