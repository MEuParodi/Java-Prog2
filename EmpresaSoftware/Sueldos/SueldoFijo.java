package EmpresaSoftware.Sueldos;

import EmpresaSoftware.Prog;

public class SueldoFijo extends Sueldo {
	
	private int sueldofijo;
	

	public SueldoFijo(int sueldofijo) {
		this.sueldofijo = sueldofijo;
	}


	@Override
	public int calcularSueldo(Prog p) {
		return this.sueldofijo;
	}
	


	
}
