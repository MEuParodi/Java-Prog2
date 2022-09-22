package Muebles;
import java.util.ArrayList;

public class Fabrica {
	private ArrayList<Producto> productos;
	private ArrayList<Stock> listaDeStock; // va a tener 3 uno se sillas, uno de mesas y uno de bancos
	
	public Fabrica(ArrayList<Producto> productos, ArrayList<Stock> listaDeStock) {
		this.productos = new ArrayList<>();
		this.listaDeStock = new ArrayList<>();
		for (Producto p: productos) {
			this.productos.add(p);
		}
		for (Stock s: listaDeStock) {
			this.listaDeStock.add(s);
		}
		
	}
	
	public void addProducto(Producto p) {
		this.productos.add(p);
		for (Stock mueble: listaDeStock) {
			if(mueble.getTipoDeMueble()==p.getNombre())
				mueble.incrementarStock();
		}
	}
	
	public double getPrecioDeTodoElStock() {
		double preciostock = 0;
		for (Producto p: productos) {
			for (Stock parProdStock: listaDeStock) {
				if(p.getNombre() == parProdStock.getTipoDeMueble())
					preciostock += parProdStock.getStock()*p.getPrecio();
			}
		}
		return preciostock;
	}
	
		public double getCostoDeTodoElStock() {
			double costostock = 0;
			for (Producto p: productos) {
				for (Stock parProdStock: listaDeStock) {
					if(p.getNombre() == parProdStock.getTipoDeMueble())
						costostock += parProdStock.getStock()*p.getCosto();
				}
			}
			return costostock;
		}

}
