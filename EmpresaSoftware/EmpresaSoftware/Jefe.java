package EmpresaSoftware;
import java.util.ArrayList;

import EmpresaSoftware.Sueldos.SueldoFijo;

public class Jefe extends Elem {

	protected ArrayList<Elem> elementos;
	private int antig;
	private int sueldofijo;

	
	public Jefe(String nombre, String apellido, int edad, int antig, int sueldofijo) {
		super(nombre, apellido, edad);
		this.antig = antig;
		this.elementos =new ArrayList<>();
		this.sueldofijo = sueldofijo;
	}

	public void addElemento (Elem e) {
		this.elementos.add(e);
	}
	@Override
	public ArrayList<String> getEspecialidad() {
		ArrayList<String> especialidades = new ArrayList<>();
		for (Elem e: elementos) {
			ArrayList<String> hijos = e.getEspecialidad();
			for (String h: hijos)
				if (!especialidades.contains(h))
					especialidades.add(h);
		}
		return especialidades;
	}
	
		
		
	@Override
	public int gastoEnSueldos() {
		int total = this.sueldofijo;
		for (Elem e: elementos) {
			total += e.gastoEnSueldos();
		}
		return total;
	}

	@Override
	public int getCantEmpleados() {
		int total = 0;
		for (Elem e: elementos) {
			total += e.getCantEmpleados();
		}
		return total;
	}

	@Override
	public ArrayList<Elem> listar() {
		ArrayList<Elem> listaEmpleados = new ArrayList<>();
		for (Elem e: elementos) {
			ArrayList<Elem> hijos = e.listar();
			for (Elem h: hijos) {
				if(!listaEmpleados.contains(h))
					listaEmpleados.add(h);
			}
		}
		listaEmpleados.add(this);
		return listaEmpleados;
			
	}

}
