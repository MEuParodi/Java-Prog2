package EstablDeportivo;

import java.util.ArrayList;

public class Administrador {
	String nombre;
	ArrayList<Usuario> socios;
	ArrayList<Cancha> canchasFutbol;
	ArrayList<Cancha> canchasPaddle;
	private static double descuentoSocios = 0.8;

	public Administrador(String nombre, ArrayList<Cancha> canchasFutbol, ArrayList<Cancha> canchasPaddle) {
		setNombre(nombre);
		this.socios = new ArrayList<Usuario>();
		setCanchasFutbol(canchasFutbol);
		setCanchasPaddle(canchasPaddle);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSocio(Usuario usuario) {
		socios.add(usuario);
	}

	public void setCanchasFutbol(ArrayList<Cancha> canchasFutbol) {
		this.canchasFutbol = canchasFutbol;
	}

	public void setCanchasPaddle(ArrayList<Cancha> canchasPaddle) {
		this.canchasPaddle = canchasPaddle;
	}

	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<Usuario> getSocios() {
		return this.socios;
	}

	public ArrayList<Cancha> getCanchasFutbol() {
		return this.canchasFutbol;
	}

	public ArrayList<Cancha> getCanchasPaddle() {
		return this.canchasPaddle;
	}

	public boolean isSocio(Usuario persona) {
		return (socios.contains(persona));
	}

	public double getPrecio(Usuario persona, Cancha cancha) {
		double precio = cancha.getPrecio();
		if (socios.contains(persona))
			return (precio * descuentoSocios);
		else
			return precio;
	}

	// asigna un turno (el turno elegido es una pos en el array de turnos)

	public void asignarTurno(String tipo, Usuario usuario, int turnoElegido) {
		if (tipo == "Futbol") {
			if ((turnoElegido) >= canchasFutbol.get(1).getQturnos()) {
				System.out.println("En " + this.nombre + " El turno no posible, estamos cerrados a ese horario");
				return;
			}

			int i = 0;
			while (i < canchasFutbol.size()) {
				if (canchasFutbol.get(i).isLibre(turnoElegido)) {
					canchasFutbol.get(i).setTurno(turnoElegido, usuario.getNombre());
					System.out.println("Turno " + turnoElegido + " asignado");
					this.incrementarQReservas(usuario);
					return;
				}
				i++;
			}
			if (i >= canchasFutbol.size())
				System.out.println("Turno " + turnoElegido + " está ocupado");
			return;
		}

		if (tipo == "Paddle") {
			if ((turnoElegido) >= canchasPaddle.get(1).getQturnos()) {
				System.out.println("En " + this.nombre + " El turno no posible, estamos cerrados a ese horario");
				return;
			}

			int i = 0;
			while (i < canchasPaddle.size()) {
				if (canchasPaddle.get(i).isLibre(turnoElegido)) {
					canchasPaddle.get(i).setTurno(turnoElegido, usuario.getNombre());
					System.out.println("Turno " + turnoElegido + " asignado");
					this.incrementarQReservas(usuario);
					return;
				}
				i++;
			}
			if (i >= canchasPaddle.size())
				System.out.println("Turno " + turnoElegido + " está ocupado");
			return;
		}
	}

	public void hacerSocio(Usuario usuario) {
		socios.add(usuario);
	}

	public void incrementarQReservas(Usuario usuario) {
		usuario.incrementarQReservas(usuario);
		if ((usuario.getQReservasUsuario() >= 4) && !(socios.contains(usuario)))
			hacerSocio(usuario);
	}

}
