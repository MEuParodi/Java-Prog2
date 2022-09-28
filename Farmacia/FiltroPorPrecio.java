package Farmacia;

public class FiltroPorPrecio extends Filtro {
	private double precioBuscado;
	
	public FiltroPorPrecio(double precioBuscado) {
		this.precioBuscado = precioBuscado;
	}
	
	@Override
	public boolean cumple(Medicamento medicamento) {
		return medicamento.getPrecio() == precioBuscado;
	}

}
