package Vivero;

public class FiltroVulgar extends Filtro {
	private String nombreBuscado;
	
	public FiltroVulgar(String nombreBuscado) {
		this.nombreBuscado = nombreBuscado; 
	}

	@Override
	public boolean cumple(Planta p) {
		return p.contieneVulgar(nombreBuscado);
	}

}
