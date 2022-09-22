package Peluqueria;

import java.util.ArrayList;

public class Peluqueria {
	private String nombrePeluqueria;
	private ArrayList<Peluquero> peluqueros; //lista con los nombres de los peluqueros
	private ArrayList <Cliente> clientes;


	//constructor para crear una nueva peluqueria
	
	public Peluqueria (String nombrePeluqueria, ArrayList<Peluquero> peluqueros, ArrayList<Cliente> clientes) {
		setNombre(nombrePeluqueria);
		this.peluqueros = new ArrayList <Peluquero> ();
		for (int i=0 ; i<peluqueros.size() ; i++) {
			this.peluqueros.add(peluqueros.get(i));
		}
		this.clientes = new ArrayList<Cliente>();
		for (int i=0 ; i<clientes.size() ; i++) {
			this.clientes.add(clientes.get(i));
		}
	}
	
	
	// setters
	public void setNombre(String nombre) {
		if (nombre != "") 
			this.nombrePeluqueria = nombre;
		else 
			System.out.println("El nombre no puede estar vacío");
	}
	
	//getters
	public String getNombre() {
		return this.nombrePeluqueria;
	}
	
	public ArrayList<Peluquero> getPeluqueros(){
		return this.peluqueros;
	}
	
	
	//metodos propios
	
	//turno x para un peluquero en especial
	public boolean setTurnoPeluquero(Cliente cliente, Peluquero peluquero, int turno) {
		return peluquero.setTurnoCliente(cliente, turno);
	}
	
	//turno x para cualquier peluquero
	public boolean setTurnoConCualquierPeluquero(Cliente cliente, int turno) {
		   for(Peluquero p: peluqueros) {
			   if (p.setTurnoCliente(cliente, turno)) {
				   return true;
				   }
		   }
		   System.out.println("ningun peluquero tiene libre ese turno");
		   return false;
	}
	
	//primer turno libre con cualquier peluquero DEBERIA RETORNAR EL TURNO Y EL PELUQUERO
	
	public int setPrimerTurnoLibre(Cliente cliente) {
		int turno = 400;
		String pelu = "";
		for (Peluquero p: peluqueros) {
			//System.out.println("     con " + p.getNombre() + " .... primer turno libre ->  " + p.buscarTurnoLibre());
			while(p.buscarTurnoLibre() < turno) {
				turno = p.buscarTurnoLibre();
				pelu = p.getNombre();
			}
		}
		if (turno == 400)
			System.out.println("No tenemos turnos libres");
		else
			System.out.println("Turno " + turno+ " libre con " + pelu);
		return turno;
	}
	
	public void agregarClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
}
