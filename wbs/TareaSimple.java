package wbs;

import java.time.LocalDate;
import java.util.ArrayList;

import wbs.Filtros.Filtro;



public class TareaSimple extends ElementoWbs {

	private ArrayList<Recurso> recursos;
	
	public TareaSimple(LocalDate inicio, LocalDate finEst, boolean completada, String estado) {
		super(inicio, finEst, completada, estado);
		this.recursos = new ArrayList<>();
	}
	
	public void addRecurso(Recurso r) {
		if (r.esPosibleAsignar(this)) {
			r.addTarea(this);
			this.recursos.add(r);
		}
		
	}

	@Override
	public LocalDate getInicio() {
		return this.inicio;
	}


	@Override
	public LocalDate getFinEstimado() {
		return this.finEst;
	}

	@Override
	public ArrayList<ElementoWbs> buscar(Filtro f) {
		ArrayList<ElementoWbs> lista = new ArrayList<>();
		if (f.cumple(this))
			lista.add(this);
		return lista;
	}

	@Override
	public ArrayList<Recurso> getRecursos() {
		ArrayList<Recurso> copia = new ArrayList<>(recursos);
		return copia;
	}


}
