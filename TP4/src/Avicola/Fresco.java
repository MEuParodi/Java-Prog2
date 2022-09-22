package Avicola;

import java.time.LocalDate;

public class Fresco {
	protected String nombre;
	protected LocalDate fVenc;
	protected LocalDate fEnv;
	protected String origen;
	protected int lote;
	
	public Fresco(String nombre, LocalDate fVenc, LocalDate fEnv, String origen, int lote) {
		this.nombre = nombre;
		this.fVenc = fVenc;
		this.fEnv = fEnv;
		this.origen = origen;
		this.lote = lote;
	}


	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setfVenc(LocalDate fVenc) {this.fVenc = fVenc;}
	public void setLote(int lote) {this.lote = lote;}
	public void setfEnv(LocalDate fEnv) {this.fEnv = fEnv;}
	public void setOrigen(String origen) {this.origen = origen;}

	public String getNombre() {return nombre;}
	public LocalDate getfVenc() {return fVenc;}
	public long getLote() {return lote;}
	public LocalDate getfEnv() {return fEnv;}
	public String getOrigen() {return origen;}
	



	@Override
	public String toString() {
		return ("Nombre: " + this.getNombre() + "\nVencimiento: " + this.fVenc + "\nLote: " + this.getLote() + "\nEnvasado: " + 
						this.getfEnv() + "\nOrigen: " + this.getOrigen());
	}





	


}
