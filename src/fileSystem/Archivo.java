package fileSystem;

import java.util.ArrayList;

public class Archivo extends Elemento{
	private int tamanio;
	private String ext;
	
	public Archivo(String nombre,  String ext, int tamanio) {
		super(nombre);
		this.tamanio = tamanio;
		this.setExt(ext);
	}

	public void setExt(String ext) {this.ext = ext;	}
	public String getExt() {return this.ext;	}
	
	@Override
	public int getTamanio() {
		return this.tamanio;
	}

	@Override
	public int CantElementos() {
		return 0;
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			
			Archivo otro = (Archivo)o;
			return (this.getNombre().equals(otro.getNombre()) && this.getExt().equals(otro.getExt()));
			
		}catch (Exception exc) {
			
			return false;
		}
		
	}

	@Override
	public ArrayList<Elemento> buscar(Filtro f) {
		ArrayList<Elemento> lista = new ArrayList<>();
			if (f.cumple(this))
				lista.add(this);
			return lista;
	}

	@Override
	public String toString() {
		return this.getNombre() +"."+this.getExt();
	}



}
