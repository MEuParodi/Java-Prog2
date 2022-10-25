import java.time.LocalDate;
import java.util.ArrayList;

public class Viaje extends Elemento{

	private Promocion promo;

	
	public Viaje(int id, String alojam, String origen, String dest, double precio, int miembros, Promocion promo) {
		super(id, alojam, origen, dest, precio, miembros);
		this.promo = promo;
	}

	public double getDescuento() {
		return this.promo.getDescuento(this);
	}
	
	
	@Override
	public double getPrecio() {
		return this.precio*(100-this.getDescuento())/100;
	}
	

	@Override
	public String getOrigen() {
		return this.origen;
	}

	@Override
	public String getDestino() {
		return this.dest;
	}

	@Override
	public LocalDate getFechaPago() {
		return this.fechaPago;
	}

	@Override
	public ArrayList<Elemento> buscar(Filtro f) {
		ArrayList<Elemento> resultado = new ArrayList<>();
		if (f.cumple(this))
			resultado.add(this);
		return resultado;
	}


}
