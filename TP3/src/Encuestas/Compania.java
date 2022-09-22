package Encuestas;
import java.util.ArrayList;

public class Compania {
	private ArrayList<Empleado> empleados;
	private ArrayList<Encuesta> encuestas;
	private ArrayList<EncuestaR> encuestasR;
	
	
	public Compania() {
		this.empleados = new ArrayList<>();
		this.encuestas = new ArrayList<>();
		this.encuestasR = new ArrayList<>();
		
	}
	
	public void setEmpleado(Empleado e) {
		this.empleados.add(e);
	}
	
	public void setEncuesta(Encuesta enc) {
		this.encuestas.add(enc);
	}

	public void setEncuestaR(EncuestaR enc) {
		if (!encuestasR.contains(enc)) {
			this.encuestasR.add(enc);
			enc.getEmpleado().incrementarEncuestas();
		}
	}

	public int getCantEncuestasR(Empleado e) {
		return e.getQEncuestasR();
	}
	
	
}
