package Celular;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//creo los prefijos y los cargo al array
		Prefijo tandil = new Prefijo("249", "Tandil");
		Prefijo mardel = new Prefijo("223", "Mardel");
		
		
		//creo un celular con la lista de prefijos
		Celular celu = new Celular();
		celu.addPrefijo(tandil);
		celu.addPrefijo(mardel);
		
		//genero los contactos
		Contacto euge = new Contacto("Euge", "249", "4520959");
		Contacto viti = new Contacto ("Viti", "223", "4567467");
		Contacto pepe = new Contacto ("Pepe", "223", "4567467");
		Contacto diego = new Contacto("Diego", "249", "4371042");
		Contacto diego2 = new Contacto("Diego", "249", "4371040");
		
		//los cargo al celular
		celu.setContacto(euge);
		celu.setContacto(viti);
		celu.setContacto(viti);
		celu.setContacto(diego);
		celu.setContacto(diego2);
		celu.setContacto(pepe);
		LocalDate fecha = LocalDate.of(2000, 01, 01);
		viti.setNacim(fecha);
		
		System.out.println(celu.mostrarContacto(viti));
		System.out.println(celu.mostrarContacto(diego));
		
		System.out.println("\nlista de todos los contactos: " + celu.getAllContactos());
		
		System.out.println("\nContactos repetidos: " + celu.getListaContactosRepetidos());
		
		System.out.println("\nPromedio de edad de los contactos = " + celu.getPromedioEdadContactos());
		
		System.out.println("\nContactos con igual nombre = " + celu.mostarContactosConIgualNombre());

	
		/**	Falta esto: Asimismo, se debe poder incorporar un listado de los contactos que poseen el mismo número de teléfono.
		*/
	}

}

