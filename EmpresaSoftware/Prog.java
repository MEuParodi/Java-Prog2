package EmpresaSoftware;
import java.util.ArrayList;

import EmpresaSoftware.Sueldos.Sueldo;

public class Prog extends Elem {
	
	private Sueldo s; //comportamiento para calcular el sueldo
	private ArrayList<String> especialidades;

	public Prog(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
	}

	public void setSueldo(Sueldo s) {
		this.s = s;
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

}
