package EmpresaSoftware;
import java.util.ArrayList;

public class Jefe extends Elem {

	protected ArrayList<Elem> elementos;
	private int antig;
	protected int maxEsp;
	
	public Jefe(String nombre, String apellido, int edad, int antig) {
		super(nombre, apellido, edad);
		this.antig = antig;
		this.maxEsp = 9999; // ver como poner un mumero muy grande 
		this.elementos =new ArrayList<>();
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
		ArrayList<String> especialidades2 = new ArrayList<>();
		int i = 0;
		while(i < this.maxEsp && i < especialidades.size()) {
			especialidades2.add(especialidades.get(i));
			i++;
		}
		return especialidades2;
	}

	@Override
	public int gastoEnSueldos() {
		int total = 0;
		for (Elem e: elementos) {
			total += e.gastoEnSueldos();
		}
		total += this.gastoEnSueldos();
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
