package Peluqueria;

public class Peluquero {
	private String nombre;
	private String[] turnos;
	private int QTurnos;

	//constructor
	public Peluquero(String nombre, int Qturnos) {
		setNombre(nombre);
		setTurnos(Qturnos);
	}
	
	//setters
	public void setNombre(String nombre) {
		if (nombre != "")
			this.nombre = nombre;
		else
			this.nombre = "XXXX";
	}

	public void setTurnos(int QTurnos) {
		this.QTurnos = QTurnos;
		this.turnos = new String[QTurnos];
		for (int i = 0; i < turnos.length; i++) {
			this.turnos[i] = "0"; // inicializo el array de turnos en todos libres al crear una cancha, luego va
									// el Usuario
		}
	}
	
	//getters
	public String[] getTurnos() {
		return turnos;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	// metodos propios
	
	// da un turno que pide un cliente
	public boolean setTurnoCliente(Cliente cliente, int turno) { // turno va de 0 a n y es una posicion en el array de turnos
		if (turno >= this.turnos.length) {
			System.out.println("A la hora no trabaja " + this.nombre);
			return false;
		}
		if (this.turnos[turno] == "0") {
			this.turnos[turno] = cliente.getNombre();
			System.out.println("Turno asignado");
			return true;
		}else {
			System.out.println("Ese turno no está disponible");
			return false;
		}
	}


	//busca y retorna el primer turno libre, si no hay turno retorna 400, si no retorna la posicion libre del array
	public int buscarTurnoLibre() {
		int i = 0;
		while (i < (this.turnos.length) && this.turnos[i] != "0") {
			i++;
		}
		if (i >= this.turnos.length) {
			//System.out.println(this.nombre + " No tiene turnos");
			return 400;
		}else {
			return i;
		}
	}
	
	
	
}
