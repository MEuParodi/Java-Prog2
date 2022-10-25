import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Paquete extends Elemento {
	
	private ArrayList <Elemento> elementos;

	public Paquete(int id, String alojam, String origen, String dest, double precio, int miembros) {
		super(id, alojam, origen, dest, precio, miembros);
		this.elementos = new ArrayList<>();
	}

	public void agregarViaje(Viaje v) {
		if (elementos.isEmpty())
			elementos.add(v);
		else
			if( v.getOrigen().equals(elementos.get(elementos.size()-1).getDestino()) )
				elementos.add(v);
	}
	
	@Override
	public double getPrecio() {
		double precio = 0;
		for(Elemento e: elementos)
			precio += e.getPrecio();
		return precio;
	}

	@Override
	public String getOrigen() {
		return elementos.get(0).getOrigen();
	}

	@Override
	public String getDestino() {
		return elementos.get(elementos.size()-1).getDestino();
	}
	

	@Override  // mi idea es hacer una copa, ver que ninguno sea null, ordenarla de mayort a menor 
				// y devolver la fecha del primer elemento
	
	public LocalDate getFechaPago() {
		ArrayList <Elemento> copia = new ArrayList<>(elementos);
		LocalDate fecha = null;
		for (Elemento e: copia)
			if (e.getFechaPago() == null)  
				return fecha;
		Collections.sort(copia, Collections.reverseOrder(new ComparadorFechaPago()));  //que esta mal aca??
		return copia.get(0).getFechaPago();
	}

	@Override
	public ArrayList<Elemento> buscar(Filtro f) {
		ArrayList <Elemento> resultado = new ArrayList<>();
		if (f.cumple(this))
			resultado.add(this);
		else 
			for (Elemento e: elementos) {
				ArrayList <Elemento> resultadohijos = e.buscar(f);
				resultado.addAll(resultadohijos);
			
		}
			
		return resultado;
	}


}
