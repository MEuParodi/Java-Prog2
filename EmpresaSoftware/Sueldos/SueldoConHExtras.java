package EmpresaSoftware.Sueldos;
import EmpresaSoftware.Prog;

public class SueldoConHExtras extends Sueldo {

	private SueldoFijo s1;
	private SueldoPorHora s2;
	private int precioHE;
	
	
	public SueldoConHExtras(SueldoFijo s1, SueldoPorHora s2) {
		this.s1 = s1;
		this.s2 = s2;
	}


	@Override
	public int calcularSueldo(Prog p) {
		return s1.calcularSueldo(p) + s2.calcularSueldo(p) + p.getCantHorasExtras() * this.precioHE;
	}

	

}
