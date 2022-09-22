package Agenda;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Main {


    
	public static void main(String[] args) {
		Usuario Pepe = new Usuario ("Pepe", "pepe@hotmail.com", 6548976);
		Usuario Juan = new Usuario ("Juan", "juan@hotmail.com", 6577976);
		Usuario Maria = new Usuario ("Maria", "maria@hotmail.com", 9548976);
		ArrayList<Usuario> asistentes = new ArrayList<Usuario>();
		asistentes.add(Pepe);
		asistentes.add(Juan);
		asistentes.add(Maria);
	    LocalDateTime inicio = LocalDateTime.of(2022, 8, 30, 15, 30);
	    LocalDateTime fin = LocalDateTime.of(2022, 8, 30, 18, 21);
	    //System.out.println(inicio);
		Reunion reunion1 = new Reunion("temaX", "Tandil", inicio, fin, asistentes);
		
		//pido el lugar y el tema
		System.out.println("Lugar: " + reunion1.getLugar());
		System.out.println("Tema: " + reunion1.getTema());
		
		//pido los asistentes
		for (Usuario a : reunion1.getAsistentes())
			System.out.println("Asistentes: " + a.getNombre());
		
		//pido el mail de Maria
		System.out.println("Mail de " + asistentes.get(2).getNombre() + ":  " + asistentes.get(2).getMail());

		//pido el mail de Juan
		for (Usuario a: asistentes) {
			if(a.getNombre() == "Juan") {
				String mail = a.getMail();
				System.out.println("Mail de Juan: " + mail);
			}
		}
		
		//pido la duracion
		System.out.println(reunion1.getInicio() + "  " + reunion1.getFin()); 
		System.out.println("Duracción:" + reunion1.getDuracion());
		
	}
		
	

}
