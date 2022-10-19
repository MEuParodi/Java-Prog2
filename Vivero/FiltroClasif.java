package Vivero;

public class FiltroClasif extends Filtro {
	private String clasifBuscada;
	
	public FiltroClasif(String clasifBuscada) {
		this.clasifBuscada = clasifBuscada;
	}

	@Override
	public boolean cumple(Planta p) {
		return p.getClasif() == clasifBuscada;
	}

}
