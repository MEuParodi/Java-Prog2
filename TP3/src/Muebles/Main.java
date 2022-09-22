package Muebles;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Producto mesa = new Producto ("mesa", 2, 1, "pino", "natural", 1.35);
		Producto silla = new Producto ("silla", 2, 5, "pino", "natural", 2);
		Producto banco = new Producto ("banco", 2, 2, "pino", "natural", 1.5);
		ArrayList<Producto> listadeProductos = new ArrayList<Producto>();
		listadeProductos.add(mesa);
		listadeProductos.add(silla);
		listadeProductos.add(banco);
		
		Stock mesas = new Stock("mesa", 100);
		Stock sillas = new Stock("silla", 50);
		Stock bancos = new Stock("banco", 25);
		ArrayList<Stock> listadeStock = new ArrayList<Stock>();
		listadeStock.add(mesas);
		listadeStock.add(sillas);
		listadeStock.add(bancos);
		
		
		Fabrica fabrica = new Fabrica(listadeProductos, listadeStock);
		
				
		System.out.println("costo de todo el stock: $" + fabrica.getCostoDeTodoElStock());
		System.out.println("precio de todo el stock: $" + fabrica.getPrecioDeTodoElStock());
		

	}

}
