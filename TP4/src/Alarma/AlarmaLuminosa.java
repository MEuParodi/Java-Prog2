package Alarma;

public class AlarmaLuminosa extends Alarma {

	public AlarmaLuminosa() {
		super();
	}

	public void hacerSonar(){
		super.hacerSonar();
		System.out.println("Encendiendo la Luz");
	}
}
