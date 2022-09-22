package EstablDeportivo;

public class Cancha {
	private String tipo;
	private String nombre;
	private double precio;
	private int Qturnos;
	private String turnos[];  // Cada posicion corresponde a un turno  


	
	//ver reservas
	
	
	public Cancha(String tipo, String nombre, long precio, int Qturnos) {
		setTipo(tipo);
		setNombre(nombre);
		setPrecio(precio);
		setQturnos(Qturnos);
	}
	
	public void setTipo(String tipo) {
		if ((tipo == "Futbol") || (tipo == "Paddle" ))
			this.tipo = tipo;
		else 
			System.out.println("Tipo de cancha incorrecto");
	}
	
	public void setNombre(String nombre) {
		if (nombre != "") 
			this.nombre = nombre;
		else 
			System.out.println("El nombre no puede estar vacío");
	}
	
	public void setPrecio(long precio) {
		if(precio>0)
			this.precio = precio;
		else
			System.out.println("El recio ingresado es incorrecto");
	}
	
	public void setQturnos(int Qturnos) {
		this.Qturnos = Qturnos;
		this.turnos = new String [Qturnos];
		for (int i=0 ; i< turnos.length ; i++) {
			this.turnos[i] = "0"; // inicializo el array de turnos en todos libres al crear una cancha, luego va el Usuario
		}
	}
	
	public void setTurno(int pos, String nombre) {
		if (pos >= this.turnos.length) {
			System.out.println("A la hora de ese turno estamos cerrados");
			return;
		}
		if (this.turnos[pos] == "0") 
			this.turnos[pos] = nombre;
		else 
			System.out.println("Ese turno no está disponible");
		return;
	}
	
	public String getTipo() {return this.tipo;}
	public String getNombre() {return this.nombre;}
	public double getPrecio() {return this.precio;}
	public int getQturnos() {return this.Qturnos;}
	public String[] getTurnos() {return this.turnos;}
	
	//dice si el turno pedido (pos en el array) esta libre o no
	
	public boolean isLibre(int pos) {
		if (this.turnos[pos]=="0")
			return true;
		else 
			return false;
	}
	

		
}
