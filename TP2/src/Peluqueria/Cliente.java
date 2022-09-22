package Peluqueria;

public class Cliente {
	private String nombre;
	private int QVisitasMes;

	public Cliente(String nombre) {
		setNombre(nombre);
		QVisitasMes = 0;
	}

	public void setNombre(String nombre) {
		if (nombre != "")
			this.nombre = nombre;
		else
			this.nombre = "XXXX";
	}

	public String getNombre() {
		return nombre;
	}

	public int getQVisitasCliente() {
		return this.QVisitasMes;
	}

	public void incrementarQVisitas(Cliente cliente) {
		this.QVisitasMes++;
	}
}
