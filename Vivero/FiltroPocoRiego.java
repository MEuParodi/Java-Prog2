package Vivero;

public class FiltroPocoRiego extends Filtro{
	private int maxRiego;
		
	public FiltroPocoRiego(int maxRiego) {
		this.maxRiego = maxRiego;
	}

	@Override
	public boolean cumple(Planta p) {
		return (p.getAgua()<maxRiego);
	}

}
