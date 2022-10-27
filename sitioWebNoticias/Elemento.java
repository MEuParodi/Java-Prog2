package sitioWebNoticias;

import java.util.ArrayList;

import sitioWebNoticias.Filtros.Filtro;

public abstract class Elemento {


	public abstract int getCantNoticias();
	
	public abstract ArrayList <Elemento> buscar (Filtro f);
	
	public abstract Elemento copiar ();
	
	public abstract Elemento copiar(Filtro f);

	public abstract String toString();

	public abstract ArrayList<String> mapaDeSitio();
}
