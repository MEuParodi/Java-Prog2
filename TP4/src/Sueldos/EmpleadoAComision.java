package Sueldos;

public class EmpleadoAComision extends Empleado {
	private double porcentajeExtra;
	private int cantVentas;
	
	public EmpleadoAComision(int legajo, int sueldo, double porcentajeExtra,int cantVentas) {
		super(legajo, sueldo);
		this.porcentajeExtra = porcentajeExtra;
		this.cantVentas = cantVentas;
	}
	
	public void addVentas(int v) {
		this.cantVentas += v;
	}
	
	@Override
	public double getSueldo() {
		return (super.getSueldo() + super.getSueldo() * this.porcentajeExtra/100 * this.cantVentas);
	}
}


