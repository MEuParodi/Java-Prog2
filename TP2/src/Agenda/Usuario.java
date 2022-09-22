package Agenda;

public class Usuario {
	private String nombre;
	private String mail;
	private int telefono;
	
	public Usuario(String nombre, String mail, int tel) {
		setNombre(nombre);
		setMail(mail);
		setTelefono(tel);
	}

	//setters
	
	public void setNombre(String nombre) {
		if(nombre != null)
		this.nombre = nombre;
		else this.nombre = "XXX" ;
	}
	
	public void setMail(String mail) {
		if(nombre != null)
			this.mail = mail;
		else this.mail = "sin mail";
	}
	
	
	public void setTelefono(int tel) {
		if (tel > 0)
			this.telefono= tel;
	}
	
	// getters
	
	public String getNombre() {
		return this.nombre;
	}

	public String getMail() {
		return this.mail;
	}
	
	public int getTelefono() {
		return this.telefono;
	}
	
	//metodos propios
	
	


	

	
}
