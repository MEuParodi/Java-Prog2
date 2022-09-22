package Empresa;

public class Persona {
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected String cargo;
	
	public Persona(String nombre, String apellido, int edad, String cargo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.cargo = cargo;
	}

	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setApellido(String apellido) {this.apellido = apellido;}
	public void setEdad(int edad) {this.edad = edad;}
	public void setCargo(String cargo) {this.cargo = cargo;}

	public String getNombre() {return nombre;}
	public String getApellido() {return apellido;}
	public int getEdad() {return edad;}
	public String getCargo() {return cargo;}
	
}
