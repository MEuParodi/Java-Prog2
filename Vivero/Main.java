package Vivero;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("pepe");
		array.add("carlos");
		array.add("jaun");
		array.add("estas son muchas palabras");
		
		System.out.println(array.contains("carlos"));
		System.out.println(array.contains("rlo"));
		System.out.println(array.contains("son"));
		
		Filtro f1 = new FiltroPocoRiego(10);
		Filtro f2 = new FiltroPocoSol(2);
		
		Filtro PocoSolPocoRiego = new FiltroAnd(f1,f2);
		
		System.out.println(PocoSolPocoRiego.cumple(null));
	}

}
