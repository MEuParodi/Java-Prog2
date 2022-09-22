package Avicola;

import java.time.LocalDate;

public class Cong_x_agua extends Refrigerado {
	private double salinidad;


	public Cong_x_agua(String nombre, LocalDate fVenc, LocalDate fEnv, String origen, int lote, double temp , String codigo, double salinidad ) {
		super(nombre, fVenc, fEnv, origen, lote, temp, codigo);
		this.salinidad = salinidad;
	}


	public double getSalinidad() {return salinidad;	}
	public void setSalinidad(double salinidad) {this.salinidad = salinidad;	}

	
	@Override
	public String toString() {
		return super.toString() + "\nSalinidad: " + this.getSalinidad();
	}
}
