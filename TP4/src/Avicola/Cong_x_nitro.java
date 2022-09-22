package Avicola;

import java.time.LocalDate;

public class Cong_x_nitro extends Refrigerado {
	private String metodoCong;
	private String tipoExpo;
	
	public Cong_x_nitro(String nombre, LocalDate fVenc, LocalDate fEnv, String origen, int lote, double temp, String codigo, String metodoCong, String tipoExpo) {
		super(nombre, fVenc, fEnv, origen, lote, temp, codigo);
		this.metodoCong = metodoCong;
		this.tipoExpo = tipoExpo;
	}

	public String getMetodoCong() {return metodoCong;}
	public String getTipoExpo() {return tipoExpo;}

	public void setMetodoCong(String metodoCong) {this.metodoCong = metodoCong;}
	public void setTipoExpo(String tipoExpo) {this.tipoExpo = tipoExpo;}

	@Override
	public String toString() {
		return super.toString() + "\nMetodo de Congelamiento: " + this.getMetodoCong() + "\nTipo de Exposicion: " + this.getMetodoCong();
	}
}
