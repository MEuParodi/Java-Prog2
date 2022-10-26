package wbs;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import wbs.Filtros.Filtro;


public abstract class ElementoWbs {
	protected LocalDate inicio;
	protected LocalDate finEst;
	protected LocalDate finReal;
	protected boolean completada;
	protected String estado;
	
		
	public ElementoWbs(LocalDate inicio, LocalDate finEst, boolean completada, String estado) {
		this.inicio = inicio;
		this.finEst = finEst;
		this.finReal = null;
		this.completada = completada;
		this.estado = estado;
	}

	public void setFinReal(LocalDate fechaFinReal) {
		this.finReal  = fechaFinReal;
	}
	
	public abstract LocalDate getInicio();
	
	public abstract LocalDate getFinEstimado();
	
	public Period getDuracionEstimada() {
		Period periodo =  Period.between(this.getFinEstimado(), this.getInicio());
		return periodo;
	}
	
	public abstract ArrayList<ElementoWbs> buscar(Filtro f);

	public String getEstado() {
		return this.estado;
	}
	
	public abstract ArrayList<Recurso> getRecursos();

}
