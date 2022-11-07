package CadenaHotelera;

import java.util.ArrayList;
import java.util.Comparator;

import CadenaHotelera.Filtros.Filtro;

public class Hotel extends ElementoAbstracto {

	private ArrayList<ElementoAbstracto> elementos;
	
	
	public Hotel(Comparator<Habitacion> comp) {
		super(comp);
		this.elementos = new ArrayList<>();
	}

	
	public void agergarElemento(ElementoAbstracto e) {
		if (!elementos.contains(e))
			elementos.add(e);
	}
	
	@Override
	public ArrayList<Habitacion> buscar(Filtro f) {
		ArrayList<Habitacion> lista = new ArrayList<>();
		for (ElementoAbstracto e: elementos) {
			ArrayList<Habitacion> hijos = e.buscar(f);
			for (Habitacion h: hijos) {
				if (h.estaLibre())
					lista.add(h);
			}
		}
		
		return lista;
	}


	@Override
	public double getdimension() {
		double dimension = 0;
		for (ElementoAbstracto e: elementos)
			dimension += e.getdimension();
		return dimension;
	}


	@Override
	public int cantidadHabLibres(Filtro f) {
		return this.buscar(f).size();
	}


	@Override
	public int cantidadHabLibres() {
		int cont = 0;
			for (ElementoAbstracto e: elementos) {
				cont += e.cantidadHabLibres();
			}
			return cont;
	}


}
