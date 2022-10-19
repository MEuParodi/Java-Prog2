package Vivero;

public class FiltroPocoSolMuchoRiego extends Filtro {
	private int minRiego;
	private int maxSol;
	
	public FiltroPocoSolMuchoRiego(int minRiego, int maxSol) {
		this.minRiego = minRiego;
		this.maxSol = maxSol;
	}

	@Override
	public boolean cumple(Planta p) {
		return (p.getSol() < maxSol && p.getAgua() > minRiego);
	}

}
