package Muebles;

public class Stock { // es un objeto por tipo de producto stockdeSillas, stockdeMesas, ...
	String tipoDeMueble;
	int stock;
	
	//se llama una sola vez cuando se crea el producto
	public Stock(String mueble, int stock) {
		this.tipoDeMueble = mueble;
		this.stock =stock;
	}

	public int getStock() {
		return this.stock;
	}
	
	public String getTipoDeMueble() {
		return this.tipoDeMueble;
	}
	
	public void incrementarStock() {
		this.stock ++;
	}
}
