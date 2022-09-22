package Avicola;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Fresco producto1 = new Fresco("tomate", LocalDate.of(2022, 9, 18), LocalDate.of(2021, 9, 30), "el tomaco", 24);
		Fresco producto2 = new Fresco("lechuga de manteca", LocalDate.of(2022, 9, 18), LocalDate.of(2021, 9, 28), "el lechugon", 22);
		Fresco producto3 = new Fresco("salmon", LocalDate.of(2022, 9, 20), LocalDate.of(2021, 9, 24), "el bagre feliz", 26);
		Fresco producto4 = new Fresco("manzana", LocalDate.of(2022, 9, 21), LocalDate.of(2021, 9, 25), "mas sanita", 13);
		    // Productos Refrigerados
		Refrigerado producto5 = new Refrigerado("leche", LocalDate.of(2022, 6, 14), LocalDate.of(2021, 2, 23), "el granjero Barry", 22, 14, "AAASDWS");
		Refrigerado producto6 = new Refrigerado("queso", LocalDate.of(2022, 4, 22), LocalDate.of(2021, 12, 12), "el granjero Barry", 22, 14, "BBBSE2");
		Refrigerado producto7 = new Refrigerado("mayonesa", LocalDate.of(2022, 5, 13), LocalDate.of(2021, 11, 20), "Hellmanns", 13, 16, "RRRTR");
		Refrigerado producto8 = new Refrigerado("mostaza", LocalDate.of(2022, 5, 22), LocalDate.of(2021, 11, 1), "savora", 30, 15, "RRRTR");
		    // Productos congelados agua
		Cong_x_agua producto9 = new Cong_x_agua("palito agua frutilla", LocalDate.of(2022, 5, 22), LocalDate.of(2021, 9, 22), "granja de helados??", 12, -14, "NNJNN", 0.3);
		Cong_x_agua producto10 = new Cong_x_agua("palito de naranja", LocalDate.of(2022, 5, 22), LocalDate.of(2021, 9, 22), "granja de helados??", 12, -14, "NNJNN", 0.3);
		    // Productos congelados aire
		Cong_x_aire producto11 = new Cong_x_aire("patamuslo", LocalDate.of(2022, 9, 20), LocalDate.of(2021, 11, 22), "el granjero Barry", 56, -12, "LLLOOO", 23, 14, 30, 33);
		Cong_x_aire producto12 = new Cong_x_aire("patamuslo deshuesada", LocalDate.of(2022, 9, 20), LocalDate.of(2021, 11, 22), "el granjero Barry", 56, -12, "LLLOOO", 23, 14, 33, 30);
		    // Productos congelados nitrogeno
		Cong_x_nitro producto13 = new Cong_x_nitro("falda", LocalDate.of(2022, 9, 20), LocalDate.of(2021, 1, 20), "el granjero Barry", 22, -13, "LLLOOO", "metodo A", "Exposicion Lenta");
		Cong_x_nitro producto14 = new Cong_x_nitro("vacio", LocalDate.of(2022, 9, 20), LocalDate.of(2021, 1, 20), "el granjero Barry", 22, -13, "LLLOOO", "metodo A", "Exposicion Lenta");

		    Avicola avicola = new Avicola();
		    
		    avicola.agregarProducto(producto1);
		    avicola.agregarProducto(producto2);
		    avicola.agregarProducto(producto3);
		    avicola.agregarProducto(producto4);
		    avicola.agregarProducto(producto5);
		    avicola.agregarProducto(producto6);
		    avicola.agregarProducto(producto7);
		    avicola.agregarProducto(producto8);
		    avicola.agregarProducto(producto9);
		    avicola.agregarProducto(producto10);
		    avicola.agregarProducto(producto11);
		    avicola.agregarProducto(producto12);
		    avicola.agregarProducto(producto13);
		    avicola.agregarProducto(producto14);

		//    avicola.mostrarTodosLosProductos();
		    avicola.ImprimirEtiqueta(producto1);
		    System.out.println("");
		    avicola.ImprimirEtiqueta(producto12);

	}

}
