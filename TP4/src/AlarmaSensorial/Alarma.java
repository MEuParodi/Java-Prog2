package AlarmaSensorial;
import java.util.ArrayList;

public class Alarma {
	private ArrayList<Sensor> sensores;

	public Alarma() { // solo crear el array vacio, los sensores mandarlos de a uno, agregarlos con set y no recibirlos como parametros
		this.sensores = new ArrayList <Sensor>();
	}

	public void setSensor(Sensor s) {
		this.sensores.add(s);
	}
	
	public boolean comprobar() {

		for (Sensor s: sensores) {
			//System.out.println("comprobando.... " + s.getZona());
			if (s.getEstado()) {
				this.hacerSonar();
				return true;
			}
		}
		return false;
	}
	
	public String InformarSensores() {
		String sens = "";
		for (Sensor s: sensores) {
			sens += " / " + s.getZona() + "  " + s.getEstado();
		}
		return sens;	
	}
	
	public void activarSensor(Sensor sens) {
		sens.activar();
	}
	
	public void hacerSonar(){
		System.out.println("UOUOUOUOUOUOUOUOUOUOUOUOWAWAWAWAWAWAWAWAWAPIPIPIPIPIPIPI");
	}

}
