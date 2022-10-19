package Futbol5.Filtros;

import Futbol5.Registro;
import Futbol5.Socio;

public class FiltroPagoMasde extends Filtro {
	private  double valorminimo;
	
		
	public FiltroPagoMasde(double valorminimo) {
		this.valorminimo = valorminimo;
	}


	@Override
	public boolean cumple(Socio socio) {
		return socio.PagoMasDe(valorminimo);
	}
	

}
