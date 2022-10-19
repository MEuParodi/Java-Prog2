package Navidad;

import java.util.ArrayList;

public class Carta {
	private Nene remitente;
	private ArrayList<String> regalos;
	
	public Carta(Nene remit) {
		this.remitente = remit;
		this.regalos = new ArrayList<>();
	}

	public void addRegalo (String r) {
		this.regalos.add(r);
	}
	
	public Nene getRemitente() {
		return this.remitente;
	}
	
	public void cambiarRegalos(String carbon){
		this.regalos.removeAll(regalos);
		this.regalos.add(carbon);
	}
	
	public boolean tieneRegalo(String regalo) {
		return this.regalos.contains(regalo);
		
		
	}
	
	public String toString() {
		return this.remitente + " " + this.regalos ;
	}
	
}
