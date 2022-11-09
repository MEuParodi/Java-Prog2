package EmpresaSoftware.Sueldos;

import EmpresaSoftware.Prog;

public class SueldoPorHora extends Sueldo {

	private int cantHoras;
	private int precioHora;
	
	
	public SueldoPorHora(int cantHoras, int precioHora) {
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}


	@Override
	public int calcularSueldo(Prog p) {
		return this.getCantHoras() * this.getPrecioHora();
	}

	
	public int getCantHoras() {
		return cantHoras;
	}

	public int getPrecioHora() {
		return precioHora;
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}

	public void setPrecioHora(int precioHora) {
		this.precioHora = precioHora;
	}

}
