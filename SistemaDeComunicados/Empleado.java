package SistemaDeComunicados;

import java.util.ArrayList;

public class Empleado extends Elemento {

	private String nombre, apellido;
	private int legajo;
	private ArrayList<Noti> mensajes;
	
	public Empleado(String nombre, String apellido,	int legajo) {
		this.nombre =nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.mensajes = new ArrayList<>();
	}

	public void addNotif(Noti n) {
		if (!this.mensajes.contains(n))
			this.mensajes.add(n);
	}
	
	public int getLegajo() {
		return this.legajo;
	}
	
	@Override
	public int cantEmpleados() {
		return 1;
	}

	@Override
	public int getCantMensajes() {
		return this.mensajes.size();
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Empleado otro = (Empleado) o;
			return(otro.getLegajo() == (this.getLegajo()));
		} catch (Exception e) {
			return false;
		}
	}
		

}
