package Aseguradora;

import java.time.LocalDate;
import java.util.ArrayList;

import Aseguradora.CalculadoresDeCosto.Costo;
import Aseguradora.Filtros.Filtro;

public class SeguroTemporal extends SeguroSimple {
	
	private LocalDate inicio;
	private LocalDate fin;
	private SeguroSimple seguroContenido;

	public SeguroTemporal (int numero, double monto, int dni, Costo c, String desc, LocalDate inicio, LocalDate fin, SeguroSimple seguroContenido)  {
		super(numero, monto, dni, c, desc);
		this.inicio = inicio;
		this.fin = fin;
		this.seguroContenido = seguroContenido;
	}

	@Override
	public ArrayList<SeguroSimple> buscar(Filtro f) {
		ArrayList<SeguroSimple> resultado = new ArrayList<>();
		if (f.cumple(this) && this.estaVigente())
			resultado.add(this);
		return resultado;
	}

	private boolean estaVigente() {
		return (fin.isAfter(LocalDate.now()));
	}
}
