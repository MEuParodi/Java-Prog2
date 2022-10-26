package wbs;

import java.time.LocalDate;

import java.util.ArrayList;

import wbs.Filtros.Filtro;

public class TareaCompuesta extends ElementoWbs {
	
	private ArrayList<ElementoWbs> elementos;
	

	public TareaCompuesta(LocalDate inicio, LocalDate finEst, boolean completada, String estado) {
		super(inicio, finEst, completada, estado);
		this.elementos = new ArrayList<>();
	}

	@Override
	public LocalDate getInicio() {
		LocalDate fecha = elementos.get(0).getInicio();
		for(ElementoWbs e: elementos) {
			if(e.getInicio().isBefore(fecha))
				fecha = e.getInicio();
		}
		return fecha;
	}
		
	
	
	@Override
	public LocalDate getFinEstimado() {
		LocalDate fecha = elementos.get(0).getFinEstimado();
		for(ElementoWbs e: elementos) {
			if(e.getFinEstimado().isAfter(fecha))
				fecha = e.getFinEstimado();
		}
		return fecha;
	}

	
	@Override
	public ArrayList<ElementoWbs> buscar(Filtro f) {
		ArrayList<ElementoWbs> lista = new ArrayList<>();
		for(ElementoWbs e: elementos) {
			ArrayList<ElementoWbs> listaHijos = e.buscar(f);
			lista.addAll(listaHijos);
		}
		return lista;
	}


	@Override
	public ArrayList<Recurso> getRecursos() { //me falta definir equals de recursos
		ArrayList<Recurso> lista = new ArrayList<>();
		for(ElementoWbs e: elementos) {
			ArrayList<Recurso> listaHijos = e.getRecursos();
			for (Recurso h: listaHijos) {
				if (!lista.contains(h))
					lista.add(h);
			}
		}
		return lista;

	}

}
