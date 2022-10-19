package Navidad;

public class Nene {
	private int dni;
	private String nombre;
	
	public Nene(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	public int getDni() {
		return this.dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		Nene otro = (Nene) obj;
		return (this.getDni() == otro.getDni());
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}

}
