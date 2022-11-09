package EmpresaSoftware;

import java.util.ArrayList;

import EmpresaSoftware.Sueldos.SueldoFijo;

public class Humilde extends Jefe {

	protected int maxEsp;
	
	
	public Humilde(String nombre, String apellido, int edad, int antig, int sueldofijo,  int maxEsp) {
		super(nombre, apellido, edad, antig, sueldofijo);
		this.maxEsp = maxEsp;
	}

		
	@Override
	public ArrayList<String> getEspecialidad() {
		ArrayList<String> especialidades = super.getEspecialidad();
		int i = 0;
		while(i < this.maxEsp && i < especialidades.size()) {
			especialidades.add(especialidades.get(i));
			i++;
		}
		return especialidades;  
	
	// 	esta es otra forma que solo funciona si en vez de "ArrayList" devuelvo "lista"
	//	ArrayList<String> lista = super.getEspecialidad();
	//	return lista.subList(0, this.maxEsp); solo anda para listas
	
	}	
	

}
