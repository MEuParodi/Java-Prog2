package EstablDeportivo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Administrador passing; // es el establecimiento deportivo;
		ArrayList<Cancha> canchasFutbol;
		ArrayList<Cancha> canchasPaddle;

		// creo las canchas, objetos de la clase Cancha
		Cancha futbol_1 = new Cancha("Futbol", "Futbol_Cancha_1", 1000, 6);
		Cancha futbol_2 = new Cancha("Futbol", "Futbol_Cancha_2", 1000, 6);
		Cancha paddle_1 = new Cancha("Paddle", "Paddle_Cancha_1", 2000, 6);
		Cancha paddle_2 = new Cancha("Paddle", "Paddle_Cancha_2", 2000, 6);
		Cancha paddle_3 = new Cancha("Paddle", "Paddle_Cancha_3", 2000, 6);
		Cancha paddle_4 = new Cancha("Paddle", "Paddle_Cancha_4", 2000, 6);

		// creo los array de canchas y les cargo las canchas
		canchasFutbol = new ArrayList<Cancha>();
		canchasFutbol.add(futbol_1);
		canchasFutbol.add(futbol_2);
		canchasPaddle = new ArrayList<Cancha>();
		canchasPaddle.add(paddle_1);
		canchasPaddle.add(paddle_2);
		canchasPaddle.add(paddle_3);
		canchasPaddle.add(paddle_4);

		// creo el establecimiento deportivo
		passing = new Administrador("Passing", canchasFutbol, canchasPaddle);

		// creo los socios
		Usuario pepe = new Usuario("Pepe");
		Usuario juan = new Usuario("Juan");
		Usuario euge = new Usuario("Euge");
		passing.socios = new ArrayList<Usuario>();
		passing.hacerSocio(pepe);
		passing.hacerSocio(juan);
		passing.hacerSocio(euge);
		Usuario viti = new Usuario("Viti"); // no es socia

		// imprime la lista de socios
		System.out.println("Lista de socios en " + passing.getNombre());
		for (Usuario s : passing.socios)
			System.out.println(s.getNombre());

		// imprime la lista de canchas
		System.out.println("\nLista de canchas de Futbol en " + passing.getNombre());
		for (Cancha f : canchasFutbol)
			System.out.println(f.getNombre());
		System.out.println("\nLista de canchas de Paddle en " + passing.getNombre());
		for (Cancha p : canchasPaddle)
			System.out.println(p.getNombre());

		// pidiendo un turno
		System.out.print("\nPidiendo el 3er turno para futbol -> ");
		passing.asignarTurno("Futbol", euge, 3);
		System.out.print("Pidiendo el 3er turno para futbol -> ");
		passing.asignarTurno("Futbol", euge, 3);
		System.out.print("Pidiendo el 4to turno para futbol -> ");
		passing.asignarTurno("Futbol", viti, 4);
		System.out.print("Pidiendo el 5to turno para futbol -> ");
		passing.asignarTurno("Futbol", viti, 5);
		System.out.print("Pidiendo el 3er turno para futbol -> ");
		passing.asignarTurno("Futbol", euge, 3);
		System.out.print("\nPidiendo el 7mo (no existe) turno para futbol -> \n");
		passing.asignarTurno("Futbol", viti, 7);

		// Turnos disponibles
		System.out.println("\nTurnos disponibles:");
		for (Cancha f : canchasFutbol) {
			for (int i = 0; i < f.getTurnos().length; i++) {
				System.out.print(f.getTurnos()[i] + " / ");
			}
			System.out.println("");
		}

		// Precios
		System.out.println("\nprecio cancha Paddle para socios -> $" + passing.getPrecio(euge, canchasPaddle.get(1)));
		System.out.println("precio cancha Paddle para no socios -> $" + passing.getPrecio(viti, canchasPaddle.get(1)));

		// pidiendo 4 turnos para que un usuario se vuelva socio
		System.out.println("\n convierto a un no socio en socio llegando a mas de 4 turnos");
		System.out.println("viti es socio? -->" + passing.isSocio(viti) + "\n");
		System.out.print("Pidiendo el 1er turno para futbol -> ");
		passing.asignarTurno("Futbol", viti, 1);
		System.out.print("Pidiendo el 2er turno para futbol -> ");
		passing.asignarTurno("Futbol", viti, 2);
		System.out.print("Pidiendo el 2er turno para futbol -> ");
		passing.asignarTurno("Futbol", viti, 1);
		System.out.println("\nreservas de Viti -> " + viti.getQReservasUsuario());

		System.out.println("viti es socio? " + passing.isSocio(viti));
		// imprime la lista de socios
		System.out.println("\nLista de socios en " + passing.getNombre());
		for (Usuario s : passing.socios)
			System.out.print(s.getNombre() + " // ");

		// Turnos disponibles
		System.out.println("\n\nTurnos disponibles:");
		for (Cancha f : canchasFutbol) {
			for (int i = 0; i < f.getTurnos().length; i++) {
				System.out.print(f.getTurnos()[i] + " / ");
			}
			System.out.println("");
		}
	}

}
