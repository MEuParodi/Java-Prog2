package fileSystem;

import java.util.ArrayList;

public class Carpeta extends Elemento{
	ArrayList<Elemento> elementos;
	
	public Carpeta(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(Elemento e) {
		if (!this.elementos.contains(e))
			this.elementos.add(e);
	}

	@Override
	public int getTamanio() {
		int resultado = 0;
		for (Elemento e: elementos)
			resultado += e.getTamanio();
		return resultado;
	}

	@Override
	public int CantElementos() {
		int resultado = this.elementos.size();  //no podria ser 1 para contarse a si misma?
		for (Elemento e: elementos)
			resultado += e.CantElementos();
		return resultado;
	}

	@Override
	public boolean equals(Object o) {
		try {
			Carpeta otro = (Carpeta)o;
			return (this.getNombre() == otro.getNombre());
		} catch(Exception e) {
			return false;
		}

		
	}

	@Override
	public ArrayList<Elemento> buscar(Filtro f) {
		ArrayList<Elemento> resultado = new ArrayList<>();
		for (Elemento e : elementos) {
			ArrayList<Elemento> hijo = e.buscar(f);
			resultado.addAll(hijo);
		}
		if (f.cumple(this))
			resultado.add(this);
		return resultado;
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}

}
