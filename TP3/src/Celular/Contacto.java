package Celular;

import java.time.LocalDate;
import java.time.Period;

public class Contacto {
	private String nombre;
	private LocalDate fNacim;	
	private String prefijo;
	private String nroLocal;
	private String direccion;	
	private String mail;
	
	public Contacto(String nombre, String prefijo, String nroLocal) {
		setNombre(nombre);
		setPrefijo(prefijo);
		setNroLocal(nroLocal);
	}
	
	private void setNroLocal(String nro) {
		this.nroLocal = nro;
		
	}

	private void setPrefijo(String pref) {
		this.prefijo = pref;
		
	}

	public void setNombre(String nombre) {
		if (nombre!= null)
				this.nombre = nombre;
		else
			this.nombre= "";
	}
	
	public void setNacim(LocalDate fNacim) {
		this.fNacim = fNacim;
	}

	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setMail(String mail) {
		if (mail.contains("@"))
			this.mail= mail;
		else 
			this.mail= "";
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public String getMail() {
		return this.mail;
	}
	
	public int getEdad() {
		if (this.fNacim !=null) {
			Period edad = Period.between(fNacim, LocalDate.now());
			return edad.getYears();
		}
		else return 0;
	}
	
	public String getTel()	{
		return (this.getPrefijo() + "-" + this.nroLocal); 
	}
	
	public String getPrefijo() {
		return this.prefijo;
	}
	
	
	@Override
	public boolean equals(Object o)	{
        Contacto otro = (Contacto) o;
		return (this.getNombre().equals(otro.getNombre())) && (this.getTel().equals(otro.getTel()));
	}

	@Override
	public String toString() {
		return this.getNombre();
	}
	
	
}
