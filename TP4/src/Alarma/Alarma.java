 package Alarma;

public class Alarma {
	private boolean rotura;
	private boolean apertura;
	private boolean movimiento;
	
	public Alarma() {
		this.rotura = false;
		this.apertura = false;
		this.movimiento = false;
	}
	
	public void setRotura() {
		this.rotura = true;
	}
	
	public void setApertura() {
		this.apertura = true;
	}
	
	public void setMovimiento() {
		this.movimiento = true;
	}
	
	public void comprobar() {
		if (this.movimiento || this.apertura || this.rotura ) {
			System.out.println("intruso detectado");
			hacerSonar();
		//	luminosa.encenderLuz();
		} else 
			System.out.println("Todo en orden");
	}
	
	public void hacerSonar(){
		System.out.println("UOUOUOUOUOUOUOUOUOUOUOUOWAWAWAWAWAWAWAWAWAPIPIPIPIPIPIPI");
	}

}
