package Navidad;

import java.util.ArrayList;

public class Zona extends Elemento {
	private ArrayList<Elemento> elementos;
	
	public Zona() {
		this.elementos = new ArrayList<>();
	}

	public void addElemento(Elemento e) {
		this.elementos.add(e);
	}
	
	@Override
	public int contarCartasConRegalo(String regalo) {
		int cont = 0;
		for (Elemento e: elementos)
			cont += e.contarCartasConRegalo(regalo);
		return cont;
	}

	@Override
	public int contarCartasNenesMalos() {
		int cont = 0;
		for (Elemento e: elementos)
		cont += e.contarCartasNenesMalos();
		return cont;
	}

	@Override
	public int contarCartas() {
		int cont = 0;
		for (Elemento e: elementos)
			cont += e.contarCartas();
		return cont;
	}

}
