package Futbol5;

import java.util.ArrayList;

public class Socio {

	private String apellido;
	private String nombre;
	private int edad;
	private boolean pago;
	private ArrayList<Registro> alquileres;
	
	public Socio (String apellido, String nombre, int edad) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.alquileres = new ArrayList<>();
		this.pago = false;
	}
	
	public void setPago() {
		this.pago = true;
	}
	
	public void addAlquiler(Registro alq) {
		this.alquileres.add(alq);
	}
	
	public boolean tengoPagoAlDia() {
		return this.pago;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public boolean AlqCancha(int nro) {
		for(Registro r: alquileres)
			if (r.getIdCancha() == (nro))
				return true;
		return false;
	}
	
	public int cantAlqCancha(int nro) {
		int cont = 0;
		for(Registro r: alquileres)
			if (r.getIdCancha() == (nro))
				cont++;
		return cont;
	}
	
	public boolean PagoMasDe(double valor) {  //esto es un filtro por precio
		for (Registro a:alquileres)
			if (a.getPrecio()>valor)
				return true;
		return false;
	}
	

	@Override
	public boolean equals(Object o) {
		Socio otro = (Socio) o;
		return (otro.getApellido() == this.getApellido()) && (otro.getNombre() == this.getNombre());
	}


	@Override
	public String toString() {
		return this.getApellido()+ " " + this.getNombre();
	}

	
}
