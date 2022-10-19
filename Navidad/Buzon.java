package Navidad;

import java.util.ArrayList;

public class Buzon extends Elemento {
	private ArrayList <Nene> buenos;
	private ArrayList <Carta> cartas;
	private String regaloMalo ="CARBON";

	public Buzon() {
		this.buenos = new ArrayList<>();
		this.cartas = new ArrayList<>();
	}
	
	public void addBueno (Nene b) {
		if(!this.buenos.contains(b)) {  //para no agregar si ya eataba
			this.buenos.add(b);
		}
	}
	
	public void setRegaloMalo(String s) {   //carbon
		this.regaloMalo = s;
	}
	
	public void addCarta (Carta c) {
		if (!buenos.contains(c.getRemitente()))
			c.cambiarRegalos(regaloMalo);
		if (!cartas.contains(c)) 
			this.cartas.add(c);
	}

	@Override
	public int contarCartas() {
		return cartas.size();
	}
	
	
	@Override 
	public int contarCartasConRegalo(String regalo) {
		int cont = 0;
		for (Carta c: this.cartas)
			if (c.tieneRegalo(regalo))
				cont ++;
		return cont;
	}

	
	@Override
	public int contarCartasNenesMalos() {
		return cartas.size() - buenos.size();
	}

}
