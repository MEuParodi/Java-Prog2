package AlarmaSensorial;


public class Main {

	public static void main(String[] args) {
		
		//creo los sensores
		Sensor puerta1 = new Sensor ("puerta1");
		Sensor puerta2 = new Sensor ("puerta2");
		Sensor movCocina = new Sensor ("movCocina");
		Sensor vidrio1 = new Sensor ("ventana_1");
		Sensor vidrio2 = new Sensor ("ventana_2");
		
		Alarma alarmaCasa = new Alarma();
		alarmaCasa.setSensor(puerta1);
		alarmaCasa.setSensor(puerta2);
		alarmaCasa.setSensor(movCocina);
		alarmaCasa.setSensor(vidrio1);
		alarmaCasa.setSensor(vidrio2);
		
		System.out.println("Estado de los sensores:");
		System.out.println(alarmaCasa.InformarSensores());
			 
		//sensando....
		System.out.println("estado de la alarma:  " + alarmaCasa.comprobar());

		//abro puerta
		System.out.println("Rotura vidrio2");
		alarmaCasa.activarSensor(vidrio2);
		
		//sensando....
		System.out.println("estado de la alarma:  " + alarmaCasa.comprobar());
		
	}

}
