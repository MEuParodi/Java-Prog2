package SistemaDeComunicados;

import java.util.ArrayList;

import SistemaDeComunicados.Comportamientos.Comportamiento;

public class Grupo extends Elemento {

	private ArrayList<Elemento> elementos;
	private Comportamiento propagacion;
	
	public Grupo(Comportamiento propagacion) {
		this.propagacion = propagacion;
		this.elementos = new ArrayList<>();
	}
	
	public void agregarElemento(Elemento e) {
		this.elementos.add(e);
	}

	@Override
	public int cantEmpleados() {
		int cont = 0;
		for(Elemento e: elementos) {
			cont += e.cantEmpleados();
		}
		return cont;
	}

	@Override
	public int getCantMensajes() {
		int cont = 0;
		for(Elemento e: elementos) {
			cont += e.getCantMensajes();
		}
		return cont;
	}

}
