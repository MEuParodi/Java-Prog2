package SistemaElectoral;

public class Candidato {

	private String nombre; 
	private String patrido; 
	private String agrup;
	
	
	public Candidato(String nombre, String patrido, String agrup) {
		this.nombre = nombre;
		this.patrido = patrido;
		this.agrup = agrup;
	}


	public String getNombre() {
		return nombre;
	}

	public String getPatrido() {
		return patrido;
	}

	public String getAgrup() {
		return agrup;
	}


	

}
