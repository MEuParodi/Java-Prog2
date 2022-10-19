package fileSystem;

import java.util.ArrayList;

public class AccesoDirecto extends Elemento{
	private static int TAMANIO = 1;			//atributo de clase, los objetos nacen con este valor
	private Elemento ref;
	
	public static void setTamanio(int tam) { //metodo estatico para poder cambiar el TAMANIO
		TAMANIO= tam;
	}
	
	public AccesoDirecto(String nombre, Elemento ref) {
		super(nombre);
		this.ref = ref;
	}

	@Override
	public int getTamanio() {
		return TAMANIO;
	}

	@Override
	public int CantElementos() {
		return 0;
	}
	
	public Elemento getRef() {
		return this.ref;
	}
	
	@Override
	public boolean equals(Object o) {
		AccesoDirecto otro = (AccesoDirecto)o;
		return (this.getNombre() == otro.getNombre());
		
	}

	@Override
	public ArrayList<Elemento> buscar(Filtro f) {
		ArrayList<Elemento> lista = new ArrayList<>();
		return lista;	
	}

}
