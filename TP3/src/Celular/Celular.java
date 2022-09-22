package Celular;

import java.util.ArrayList;

public class Celular {
	private ArrayList<Contacto> contactos;
	private ArrayList<Prefijo> prefijos;
	
	public Celular() {
		this.prefijos = new ArrayList<Prefijo>();
		this.contactos = new ArrayList<Contacto>();
	}
	
	public void addPrefijo(Prefijo p) {
		this.prefijos.add(p);
	}
	
	public void setContacto(Contacto c) {
		contactos.add(c);
	}

	public String mostrarContacto(Contacto c)	{
		String cadena = "Nombre: " + c.getNombre() + " edad: " + c.getEdad() + " años Tel: " + c.getTel() + " Cuidad: " + this.getCiudad(c);
		return cadena;
	}

	private String getCiudad(Contacto c) {
		for (Prefijo p: prefijos) {
			if (c.getPrefijo().equals(p.getPrefijo()))
				return p.getCiudad();
		}
		return ("característica inexistente");
	}


	public ArrayList<Contacto> getAllContactos ()	{
		return new ArrayList<> (contactos);
	}

	public double getPromedioEdadContactos() {
		int suma = 0;
		int cont = 0;
		for (Contacto c: contactos) {
			if (c.getEdad()!=0) {
				suma += c.getEdad();
				cont ++;
			}
		}
		if (cont!=0)
			return (suma/cont);
		else
			return 0;
	}
	
	public ArrayList<Contacto> getListaContactosRepetidos() {
		ArrayList<Contacto> repetidos = new ArrayList<Contacto>();
		for (int i= 0 ; i < contactos.size() ; i++){
			for (int j= (i+1) ; j < (contactos.size()) ; j++) {
				//System.out.println("comparando " + contactos.get(i) + " con " + contactos.get(j));
				if ((contactos.get(i)).equals(contactos.get(j))) {
					repetidos.add(contactos.get(i));
				}
			}
				
		}
		return repetidos;	
	}
	
	public String mostarContactosConIgualNombre() {
		String lista = "";
		for (int i= 0 ; i < contactos.size() ; i++){
			for (int j= (i+1) ; j < (contactos.size()) ; j++) {
				//System.out.println("comparando " + contactos.get(i) + " con " + contactos.get(j));
				if ((contactos.get(i)).getNombre() == (contactos.get(j).getNombre())) {
					lista += " / " + contactos.get(i).getNombre();
				}
			}
		}
		return lista;
	}
}


