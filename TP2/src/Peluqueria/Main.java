/**
 * Una peluquería desea implementar un sistema que le permita organizar a sus clientes.
La peluquería posee 4 peluqueros. Los clientes al solicitar un turno indican con cuál
peluquero se desean cortar. El sistema además de registrar los turnos, debe poder buscar
el primer turno disponible, también el primero disponible con un determinado
peluquero. A los clientes frecuentes se les descuenta un 10%. Se considera cliente
frecuente al que saca turno al menos una vez por mes.
 */

package Peluqueria;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Peluqueria GinoCoiffeur;
		ArrayList<Peluquero> peluqueros;
		ArrayList<Cliente> clientes;

		// creo los peluqueros
		Peluquero gino = new Peluquero("Gino", 10);
		Peluquero rober = new Peluquero("Roberto", 5);
		Peluquero maria = new Peluquero("Maria", 7);
		Peluquero jaz = new Peluquero("Jaz", 4);

		// creo el array de peluqueros y lo lleno con los peluqueros
		peluqueros = new ArrayList<Peluquero>();
		peluqueros.add(gino);
		peluqueros.add(rober);
		peluqueros.add(maria);
		peluqueros.add(jaz);

		// creo clientes
		clientes = new ArrayList<Cliente>();
		Cliente euge = new Cliente("Euge");
		Cliente viti = new Cliente("Viti");
		Cliente leo = new Cliente("Leo");
		clientes.add(leo);
		clientes.add(viti);
		clientes.add(euge);

		// creo la peluqueria
		GinoCoiffeur = new Peluqueria("GinoCoiffeur", peluqueros, clientes);

		System.out.println("Nombre de la pelu: " + GinoCoiffeur.getNombre());
		System.out.println("Cantidad de peluqueros: " + GinoCoiffeur.getPeluqueros().size());
		for (Peluquero p : peluqueros)
			System.out.println(p.getNombre());

		// cliente pide turno con Gino
		System.out.println("\nPidiendo el 4to. turno para Leo con Gino ");
		GinoCoiffeur.setTurnoPeluquero(leo, gino, 0);
		System.out.println("\nPidiendo el 4to. turno para Leo con Gino ");
		GinoCoiffeur.setTurnoPeluquero(leo, gino, 1);
		System.out.println("\nPidiendo el 12to. turno para Leo con Gino ");
		GinoCoiffeur.setTurnoPeluquero(leo, gino, 11);
		System.out.println("\nPidiendo varios turnos ");
		GinoCoiffeur.setTurnoPeluquero(leo, gino, 2);
		GinoCoiffeur.setTurnoPeluquero(leo, gino, 7);
		GinoCoiffeur.setTurnoPeluquero(euge, rober, 0);
		GinoCoiffeur.setTurnoPeluquero(leo, rober, 1);
		GinoCoiffeur.setTurnoPeluquero(viti, rober, 2);
		GinoCoiffeur.setTurnoPeluquero(viti, rober, 3);
		GinoCoiffeur.setTurnoPeluquero(euge, jaz, 0);
		GinoCoiffeur.setTurnoPeluquero(leo, jaz, 1);
		GinoCoiffeur.setTurnoPeluquero(euge, jaz, 2);
		GinoCoiffeur.setTurnoPeluquero(leo, jaz, 3);
		GinoCoiffeur.setTurnoPeluquero(euge, maria, 0);
		GinoCoiffeur.setTurnoPeluquero(leo, maria, 1);
		GinoCoiffeur.setTurnoPeluquero(euge, maria, 2);
		GinoCoiffeur.setTurnoPeluquero(leo, maria, 6);

		// Turnos disponibles
		System.out.println("\nTurnos disponibles:");
		for (Peluquero p : peluqueros) {
			System.out.print(p.getNombre() + " -->  ");
			for (int i = 0; i < p.getTurnos().length; i++) {
				System.out.print(p.getTurnos()[i] + " / ");
			}
			System.out.println("");
		}

		// pide el turno 0 con cualquier peluquero
		System.out.println("\nPido turno 0 con cualquier peluquero");
		GinoCoiffeur.setTurnoConCualquierPeluquero(leo, 0);

		// Turnos disponibles
		System.out.println("\nTurnos disponibles:");
		for (Peluquero p : peluqueros) {
			System.out.print(p.getNombre() + " -->  ");
			for (int i = 0; i < p.getTurnos().length; i++) {
				System.out.print(p.getTurnos()[i] + " / ");
			}
			System.out.println("");
		}

		// pide el primer turno libre con Gino
				System.out.println("\nPido el primer turno libre con Roberto -->  es el turno " + rober.buscarTurnoLibre() );
				
		// pide el primer turno libre con cualquier peluquero
		System.out.print("\nPido el primer turno libre con cualquier peluquero -->  ");
		GinoCoiffeur.setPrimerTurnoLibre(leo);



	}// main
}// clase