package Alarma;

public class Main {
	
	public static void main(String[] args) {
		Alarma sonora = new Alarma ();
		AlarmaLuminosa luminosa = new AlarmaLuminosa ();
	
		
		//sensando....
		sonora.comprobar();
		luminosa.comprobar();
	
		//abro puerta
		sonora.setApertura();
		
		//sensando....
		sonora.comprobar();
		luminosa.comprobar();
	}

}
