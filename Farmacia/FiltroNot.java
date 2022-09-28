package Farmacia;

public class FiltroNot extends Filtro {
	private Filtro filtroANegar;

	public FiltroNot(Filtro f) {
		this.filtroANegar = f;
	}
	
	@Override
	public boolean cumple(Medicamento medicamento) {
		return !this.filtroANegar.cumple(medicamento);
	}

}
