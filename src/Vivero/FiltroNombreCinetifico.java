package Vivero;

public class FiltroNombreCinetifico extends Filtro {
	private String nombreBuscado;
	
	public boolean cumple(Planta p) {
		return (p.getNombreCient().contains(this.nombreBuscado));
	}

}
