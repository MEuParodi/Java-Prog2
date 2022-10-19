package Vivero;

public class FiltroMuchoSolPocoRiego extends Filtro {
	private int maxRiego;
	private int minSol;
	
	public FiltroMuchoSolPocoRiego(int maxRiego, int minSol) {
		this.maxRiego = maxRiego;
		this.minSol = minSol;
	}

	@Override
	public boolean cumple(Planta p) {
		return (p.getSol() > minSol && p.getAgua() < maxRiego);
	}

}
