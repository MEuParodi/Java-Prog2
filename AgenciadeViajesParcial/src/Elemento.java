import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Elemento{
	
	protected int id;
	protected String alojam;
	protected String origen;
	protected String dest;
	protected LocalDate fechaPago;
	protected double precio;
	protected int miembros;
	
	public Elemento(int id, String alojam, String origen, String dest, double precio, int miembros) {
		super();
		this.id = id;
		this.alojam = alojam;
		this.origen = origen;
		this.dest = dest;
		this.fechaPago = null;
		this.precio = precio;
		this.miembros = miembros;
	}
	
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	public abstract double getPrecio();
	public abstract String getOrigen();
	public abstract String getDestino();
	public abstract LocalDate getFechaPago();

	
	public int getMiembros() {
		return this.miembros;
	}
	
	public int getId() {
		return this.id;
	}
	
	public abstract ArrayList<Elemento> buscar (Filtro f);
	
	public ArrayList<Elemento> buscarOrdenado (Filtro f, Comparator<Elemento> comp){
		ArrayList<Elemento> resultado = this.buscar(f);
		Collections.sort(resultado, comp);
		return resultado;
	}

}
