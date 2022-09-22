package Avicola;

import java.time.LocalDate;

public class Refrigerado extends Fresco{
	protected double temp;
	protected String codigo;

	public Refrigerado(String nombre, LocalDate fVenc, LocalDate fEnv, String origen, int lote , double temp , String codigo) {
		super(nombre, fVenc, fEnv, origen, lote);
		this.temp = temp;
		this.codigo = codigo;
	}

	public double getTemp() {return temp;}
	public String getCodigo() {return codigo;}
	
	public void setTemp(double temp) {this.temp = temp;}
	public void setCodigo(String codigo) {this.codigo = codigo;	}

	@Override
	public String toString() {
		return super.toString() + "\nTemperatura: " + this.getTemp() + "\ncodigo: " + this.getCodigo();
	}
}
