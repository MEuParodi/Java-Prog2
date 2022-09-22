package Avicola;

import java.util.ArrayList;

public class Avicola {
	private ArrayList<Fresco> frescos;
	
	public Avicola() {
		frescos = new ArrayList<>();
	}
	
	public void agregarProducto(Fresco f) {
		frescos.add(f);
	}
	
	public void ImprimirEtiqueta(Fresco f) {
		System.out.println(f);
	}
}
