package sitioWebNoticias;

import java.util.ArrayList;

import sitioWebNoticias.Filtros.Filtro;

public class Compuesto extends Elemento {
	private String nombre;
	private String descr;
	private String image;
	private ArrayList<Elemento> elementos;

	
	public Compuesto(String nombre, String descr, String image) {
		this.nombre = nombre;
		this.descr = descr;
		this.image = image;
		this.elementos = new ArrayList<>();
	}

	public String getNombre() {	return nombre;	}
	public String getDescr() {	return descr;	}
	public String getImage() {	return image;	}

	public void setNombre(String nombre) {	this.nombre = nombre;	}
	public void setDescr(String descr) {	this.descr = descr;	}
	public void setImage(String image) {	this.image = image;	}
	
	public void addElemento(Elemento e) {
		this.elementos.add(e);
		
	}

	@Override
	public int getCantNoticias() {
		int cant = 0;
		for(Elemento e: elementos)
			cant += e.getCantNoticias();
		return cant;
	}


	@Override
	public String toString() {
		String cadena = this.getNombre() + "/";
		for (Elemento e: elementos)
			cadena += e.toString();
		return cadena;
		
	}

	@Override
	public ArrayList<Elemento> buscar(Filtro f) {
		ArrayList<Elemento> respuesta = new ArrayList<>();
		for (Elemento e: elementos) {
			ArrayList<Elemento> respHijos = e.buscar(f);
			respuesta.addAll(respHijos);
		}
		return respuesta;
	}
	
	@Override
	public Elemento copiar() {
		Compuesto copia = new Compuesto (this.getNombre(), this.getDescr(), this.getImage());
		for (Elemento e: elementos) {
			copia.addElemento(e.copiar());
			
		}
		return copia;
	}
		
	

	@Override
	public Elemento copiar(Filtro f) {
		Compuesto copiaCompuesto = new Compuesto (this.getNombre(), this.getDescr(), this.getImage());
		for (Elemento e: elementos) {
			Elemento copiaHijo = e.copiar(f);
			if (copiaHijo != null)
				copiaCompuesto.addElemento(copiaHijo); //agrego un Elemento al compuesto
		}
			if (copiaCompuesto.estaVacia())
				return null;
			else
				return copiaCompuesto;
			
	
	}

	private boolean estaVacia() {
		return (this.elementos.isEmpty());
	}

	@Override
	public ArrayList<String> mapaDeSitio() {
		ArrayList<String> resultado = new ArrayList<>();
		resultado.add(this.getNombre()+ "\\" );
		for (Elemento e: elementos) {
			ArrayList<String> resultadoHijo = e.mapaDeSitio();
			for (String s: resultadoHijo)
				resultado.add(this.getNombre() + "\\" + s);
		}
		return resultado;
	}

}
