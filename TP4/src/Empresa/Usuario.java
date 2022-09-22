package Empresa;

public class Usuario extends Persona {
	private String user;
	private String pss;
	
	public Usuario(String nombre, String apellido, int edad, String cargo, String user, String pss) {
		super(nombre, apellido, edad, cargo);
		this.user = user;
		this.pss = pss;
	}
	
	public String getUser() { return user;}
	public void setUser(String user) { this.user = user;}
	
	public String getPss() { return pss;}
	public void setPss(String pss) { this.pss = pss;}
	

	
}
