package Farmacia;

public class Medicamento {
	private String laboratorio;
	private String nombre;
	private double precio;
	
	public Medicamento(String laboratorio, String nombre, double precio) {
		this.laboratorio = laboratorio;
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

}
