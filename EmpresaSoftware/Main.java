package EmpresaSoftware;

import java.util.Comparator;

import EmpresaSoftware.Comparadores.CompApellidoNombre;

public class Main {

	public static void main(String[] args) {
		Jefe Leon = new Jefe("Leon", "Perez", 38, 5);
		Jefe Andres = new Jefe("Andres", "Gomez", 38, 2);
		Jefe Timoteo = new Jefe("Timoteo", "Perales", 38, 3);
		Prog Luisana = new Prog("Luisana", "Suarez", 38);
		Jefe Ciro = new Jefe("Ciro", "Locomo", 38, 1);
		Prog Viti = new Prog("Viti", "Cybrian", 38);
		Prog Sole = new Prog("Sole", "Solarium", 38);
		Prog Cort = new Prog("Cort", "Cortazar", 38);
		Prog Ale = new Prog("Ale", "Perez", 38);
		Prog Siri = new Prog("Siri", "Perez", 38);
		Prog Maria = new Prog("Maria", "Perez", 38);
		Prog Jose = new Prog("Jose", "Perez", 38);
		
		Leon.addElemento(Andres);
		Leon.addElemento(Timoteo);
		Leon.addElemento(Luisana);
		Andres.addElemento(Ciro);
		Andres.addElemento(Viti);
		Andres.addElemento(Sole);
		Ciro.addElemento(Maria);
		Ciro.addElemento(Jose);
		Timoteo.addElemento(Cort);
		Timoteo.addElemento(Ale);
		Timoteo.addElemento(Siri);
		
		Comparator c = new CompApellidoNombre();
		
		System.out.println(Leon.listarOrdenado(c));

	}

}
