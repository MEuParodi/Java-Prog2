package sitioWebNoticias;

import java.util.ArrayList;

import sitioWebNoticias.Filtros.Filtro;

public class Admin {
	ArrayList <Elemento> elementos;
	
	public Admin() {
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(Elemento e) {
		this.elementos.add(e);
	}
	
	public String mapaDeSitio() {
		String mapaDeSitio = "";
		for (Elemento e: elementos) {
			mapaDeSitio += e.toString() + "\n";
		}
		return mapaDeSitio;
	}
	

}
