package EmpresaSoftware;

import java.util.Comparator;

import EmpresaSoftware.Comparadores.CompApellidoNombre;
import EmpresaSoftware.Sueldos.SueldoPorHora;

public class Main {

	public static void main(String[] args) {
		
		SueldoPorHora sueldo = new SueldoPorHora(50);
		Jefe Leon = new Jefe("Leon", "Perez", 38, 5, 7000);
		Jefe Andres = new Jefe("Andres", "Gomez", 38, 2, 7000);
		Jefe Timoteo = new Jefe("Timoteo", "Perales", 38, 4, 5000);
		Prog Luisana = new Prog("Luisana", "Suarez", 38, sueldo, 10);
		Jefe Ciro = new Jefe("Ciro", "Locomo", 38, 1, 5000);
		Prog Viti = new Prog("Viti", "Cybrian", 38, sueldo, 10);
		Prog Sole = new Prog("Sole", "Solarium", 38, sueldo, 10);
		Prog Cort = new Prog("Cort", "Cortazar", 38, sueldo, 10);
		Prog Ale = new Prog("Ale", "Perez", 38, sueldo, 10);
		Prog Siri = new Prog("Siri", "Perez", 38, sueldo, 10);
		Prog Maria = new Prog("Maria", "Perez", 38, sueldo, 10);
		Prog Jose = new Prog("Jose", "Perez", 38, sueldo, 10);
		
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
