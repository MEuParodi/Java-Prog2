package Vivero;
import java.util.ArrayList;

public class Planta {

	private String nombreCient;
	private ArrayList<String> vulgares;
	private String clasif;
	private String flia;
	private String clase;
	private String lugar;
	private int sol;
	private int agua;
	public Planta(String nombreCient, ArrayList<String> vulgares, String clasif, String flia, String clase,
			String lugar, int sol, int agua) {
		this.nombreCient = nombreCient;
		vulgares = new ArrayList<>();
		this.clasif = clasif;
		this.flia = flia;
		this.clase = clase;
		this.lugar = lugar;
		this.sol = sol;
		this.agua = agua;
	}
	
	public void setNombreCient(String nombreCient) {this.nombreCient = nombreCient;}
	public void setClasif(String clasif) {this.clasif = clasif;}
	public void setFlia(String flia) {this.flia = flia;}
	public void setClase(String clase) {this.clase = clase;	}
	public void setLugar(String lugar) {this.lugar = lugar;	}
	public void setSol(int sol) {this.sol = sol;}
	public void setAgua(int agua) {this.agua = agua;}
	
	public String getNombreCient() {return nombreCient;}
	public String getClasif() {return clasif;}
	public String getFlia() {return flia;}	
	public String getClase() {return clase;}
	public String getLugar() {return lugar;}
	public int getSol() {return sol;}
	public int getAgua() {return agua;}
	
	public void addVulgar(String v) {
		this.vulgares.add(v);
	}
	
	public boolean contieneVulgar(String v) {
		return this.vulgares.contains(v);
	}

}
