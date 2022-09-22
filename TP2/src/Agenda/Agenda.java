package Agenda;
import java.util.ArrayList;

public class Agenda {
	private Usuario duenio;
	private ArrayList<Reunion> reuniones; 

	//constructores
	
	public Agenda (Usuario duenio) {
		this.setDuenio(duenio); // puedo poner this o no, si no lo pongo java lo pone
	}
	
	public Agenda (Usuario duenio, ArrayList<Reunion> reuniones) {
		setDuenio(duenio);
		this.setReuniones(reuniones);
	}

	
	//seters
	
	public void setDuenio(Usuario duenio) {
		this.duenio = duenio;
	}
	
	public void setReuniones(ArrayList<Reunion> reuniones) {
		if (reuniones !=null) {
			for (int r=0 ; r<reuniones.size() ; r++) {
				this.reuniones.add(reuniones.get(r));
			}
		}
	}
	
	
	// getters 
	public Usuario getDuenio() {
		return duenio;
	}

	public ArrayList<Reunion> getReuniones() {
		return reuniones;
	}

	
	
}