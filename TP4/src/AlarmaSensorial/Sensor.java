package AlarmaSensorial;

public class Sensor {
	private Boolean estado;
	private String zona;

	public Sensor(String zona) {
		this.estado = false;
		this.zona = zona;
	}
	
	public String getZona() {
		return this.zona;
	}

	public void activar() {
		this.estado = true;
		
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
}
