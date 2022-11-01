package SistemaDeComunicados;

import java.util.ArrayList;
import java.util.Collections;

import SistemaDeComunicados.Filtros.Filtro;

public abstract class Elemento {

	public abstract int cantEmpleados();
	
	public abstract int getCantMensajes();
	
	public abstract ArrayList<Empleado> buscar(Filtro f);
	
	public ArrayList<Empleado> buscarOrdenado(Filtro f, Comparator<Empleado> comp){
		ArrayList<Empleado> lista = this.buscar(f);
		Collections.sort(lista, comp);
		return lista;
	}
	
		
}

