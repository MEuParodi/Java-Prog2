package Navidad;

public class Nene {
	private int dni;
	
	public Nene(int dni) {
		this.dni = dni;
	}

	public int getDni() {
		return this.dni;
	}
	
	@Override
	public boolean equals(Object obj) {
		Nene otro = (Nene) obj;
		return (this.getDni() == otro.getDni());
	}

	
}
