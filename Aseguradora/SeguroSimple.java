package Aseguradora;

import java.util.ArrayList;

import Aseguradora.CalculadoresDeCosto.Costo;
import Aseguradora.Filtros.Filtro;

public class SeguroSimple extends Seguro {

	private int numeroPoliza;
	private double monto;
	private String descr;
	private Costo c; //clase costo abstracta y clases que definen diferentes formas de calcularlo
	
	public SeguroSimple(int numero, double monto, int dni, Costo c, String desc)  {
		super(dni);
		this.numeroPoliza = numero;
		this.monto = monto;
		this.descr = desc;
		this.c = c;
	}
	
	public void setCalculoCosto(Costo c) {
		this.c = c;
	}
	
	public String getDescr() {
		return this.descr;
	}

	@Override
	public int getNumero() {
		return this.numeroPoliza;
	}

	@Override
	public double getMonto() {
		return this.monto;
	}

	@Override
	public int getDni() {
		return this.dni;
	}


	@Override
	public ArrayList<SeguroSimple> buscar(Filtro f) {
		ArrayList<SeguroSimple> resultado = new ArrayList<>();
		if (f.cumple(this))
			resultado.add(this);
		return resultado;
	}

	@Override
	public double getCosto() {
		return c.calcularCosto(this);
	}
	
	

}
