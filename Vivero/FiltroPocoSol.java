package Vivero;

public class FiltroPocoSol extends Filtro {
	
	int maximoSol;

	public FiltroPocoSol(int maximoSol) {
		// TODO Auto-generated constructor stub
		this.maximoSol = maximoSol;
	}

	@Override
	public boolean cumple(Planta p) {
		// TODO Auto-generated method stub
		return p.getSol()< this.maximoSol;
	}

}
