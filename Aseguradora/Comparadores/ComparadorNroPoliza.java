package Aseguradora.Comparadores;

import java.util.Comparator;

import Aseguradora.SeguroSimple;

public class ComparadorNroPoliza implements Comparator<SeguroSimple> {

	@Override
	public int compare(SeguroSimple s1, SeguroSimple s2) {
		return s1.getNumero() - s2.getNumero();
	}

}

