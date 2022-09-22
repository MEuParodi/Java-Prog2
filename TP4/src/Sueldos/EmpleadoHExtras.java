package Sueldos;

public class EmpleadoHExtras extends Empleado {
	private int valorHExtra;
	private int cantHorasExtra;

	public EmpleadoHExtras(int legajo, int sueldo, int valorHExtra) {
		super(legajo, sueldo);
		this.valorHExtra = valorHExtra;
	}
	
	public void addHorasExtras(int h) {
		this.cantHorasExtra += h;
	}
	
	@Override
	public double getSueldo() {
		return super.getSueldo() + valorHExtra * cantHorasExtra;
	}
}
