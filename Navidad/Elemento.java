package Navidad;

public abstract class Elemento {
	
	// 2. Dado un buz�n, provincia o pa�s, conocer la cantidad de cartas recibidas que piden un Determinado regalo
	public abstract int contarCartasConRegalo(String regalo);

	
	//1. Dado un buz�n, provincia o pa�s, conocer el porcentaje de cartas recibidas que piden un determinado regalo.
	// ESTO ES UN TEMPLATE, METODO CONCRETO QUE USA LOS ABSTRACTOS
	public double calcularPorcentaje(String regalo) {
		return contarCartasConRegalo(regalo) / contarCartas() * 100;
	}
	
	
	//3. Dado un buz�n, provincia o pa�s, conocer la cantidad de ni�os malos que enviaron una carta.
	public abstract int contarCartasNenesMalos();
	
	// 4. Dado un buz�n, provincia o pa�s, conocer la cantidad de total de cartas recibidas.
	public abstract int contarCartas();
	
}
