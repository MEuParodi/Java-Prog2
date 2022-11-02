package Aseguradora;

import java.util.ArrayList;

import Aseguradora.CalculadoresDeCosto.Costo;
import Aseguradora.Filtros.Filtro;

public class SeguroIntegrador extends Seguro {
	
	private ArrayList <Seguro> seguros;

	public SeguroIntegrador(int dni) {
		super(dni);
		this.seguros = new ArrayList<>();
	}

	@Override
	public int getNumero() {
		int num= 0;
		for(Seguro e: seguros)
			if(e.getNumero()>num)
				num = e.getNumero();
		return num;
	}

	@Override
	public double getMonto() {
		int monto= 0;
		for(Seguro e: seguros)
			monto += e.getMonto();
		return monto;
	}

	@Override
	public int getDni() {
		return this.dni;
	}

	@Override
	public ArrayList<SeguroSimple> buscar(Filtro f) {
		ArrayList<SeguroSimple> lista = new ArrayList<>();
		for (Seguro s: seguros) {
			ArrayList<SeguroSimple> listaHijo = s.buscar(f);
			lista.addAll(listaHijo);
		}
		return lista;
	}

	@Override
	public double getCosto() {
		double costoTotal = 0;
		for (Seguro s: seguros)
			costoTotal += s.getCosto();
		return costoTotal;
	}

}
