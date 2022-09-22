package Muebles;

public class Producto {

		private String nombre;
		private int peso;
		private double costo;
		private double precio;
		private String madera;
		private String color;
		private double markup;
		
		public Producto(String nombre, int peso, double costo, String madera, String color, double markup ) {
			this.nombre = nombre;
			this.peso = peso;
			this.costo = costo;
			this.markup = markup;
			this.precio = costo*markup;
			this.madera = madera;
			this.color = color;
		}
		
		//getters y setter todos 
		
		public String getNombre() {
			return this.nombre;
		}
		
		public double getCosto() {
			return this.costo;
		}
		
		public double getPrecio() {
			return this.precio;
		}
		
	

}
