package EmpresaSoftware.Sueldos;

import EmpresaSoftware.Prog;

public class SueldoPorHora extends Sueldo {

		private int precioHora;
	
	
	public SueldoPorHora(int precioHora) {
		this.precioHora = precioHora;
	}


	@Override
	public int calcularSueldo(Prog p) {
		return p.getCantHorasMensuales()* this.getPrecioHora();
	}

	public int getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(int precioHora) {
		this.precioHora = precioHora;
	}

}
