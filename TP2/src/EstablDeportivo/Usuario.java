package EstablDeportivo;

public class Usuario {
	private String nombre;
	private int QReservasUsuario;
	
	public Usuario(String nombre) {
		setNombre(nombre); 
		QReservasUsuario = 0;
	}
	
	public void setNombre(String nombre){
		if (nombre!= "")
			this.nombre = nombre;
		else
			this.nombre = "XXXX";
	}

	public String getNombre() {return nombre;}
	public int getQReservasUsuario() {return this.QReservasUsuario;}
	
	public void incrementarQReservas(Usuario usuario) {this.QReservasUsuario ++;}
}
