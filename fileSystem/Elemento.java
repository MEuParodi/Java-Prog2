package fileSystem;

import java.util.ArrayList;

public abstract class Elemento {
	private String nombre;
	
	public Elemento(String nombre) {
		this.nombre = nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public abstract int getTamanio();
	
	public abstract int CantElementos();
	
	public abstract ArrayList<Elemento> buscar(Filtro f);
	

}
