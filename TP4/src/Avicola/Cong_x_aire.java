package Avicola;

import java.time.LocalDate;

public class Cong_x_aire extends Refrigerado {
	private double pjeNitro;
	private double pjeOx;
	private double pjeCo2;
	private double pjeVapor;
	
	public Cong_x_aire(String nombre, LocalDate fVenc, LocalDate fEnv, String origen, int lote, double temp , String codigo , double pjeNitro ,
			double pjeOx,double pjeCo2, double pjeVapor ) {
		super (nombre, fVenc, fEnv, origen, lote, temp , codigo);
		this.pjeNitro = pjeNitro;
		this.pjeOx = pjeOx;
		this.pjeCo2 = pjeCo2;
		this.pjeVapor = pjeVapor;
	}

	public double getPjeNitro() {return pjeNitro;}
	public double getPjeOx() {return pjeOx;}
	public double getPjeCo2() {return pjeCo2;}
	public double getPjeVapor() {return pjeVapor;}

	public void setPjeNitro(double pjeNitro) {this.pjeNitro = pjeNitro;}
	public void setPjeOx(double pjeOx) {this.pjeOx = pjeOx;}
	public void setPjeCo2(double pjeCo2) {this.pjeCo2 = pjeCo2;}
	public void setPjeVapor(double pjeVapor) {this.pjeVapor = pjeVapor;}
	
	
	@Override
	public String toString() {
		return super.toString() + "\n% Nitrogeno: " + this.getPjeNitro() + "\n% Oxigeno: " + this.getOrigen()+ "\n% CO2: " + 
					this.getPjeCo2() + "\n% Vapor: " + this.getPjeVapor();
	}
}
