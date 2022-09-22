package Encuestas;

public class EncuestaR {
	private int id;
	private Empleado empleado;
	private long dniEncuestado;
	
	//para instanciar una encuesta contestada, el empleado no debe haber presentado otra con el mismo id
	public EncuestaR(Empleado empleado, long dniEncuestado, int id) {
		this.empleado = empleado;
		this.dniEncuestado = dniEncuestado;
		this.id = id;
	}
	
	public Empleado getEmpleado() {
		return this.empleado;
	}
	
	public int getId() {
		return this.id;
	}
	
	public long getDniEncuestado() {
		return this.dniEncuestado;
	}

	@Override //defino cuando dos encuestas son iguales
	public boolean equals(Object o) {
		EncuestaR otra = (EncuestaR) o;
		return (otra.getId() == this.getId() && otra.getDniEncuestado() == this.getDniEncuestado() );
	}
	
	
}
