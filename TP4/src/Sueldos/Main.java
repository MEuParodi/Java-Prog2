package Sueldos;

public class Main {

	public static void main(String[] args) {

		Empleado empContratado = new Empleado(123, 1000);
		EmpleadoHExtras empHEx = new EmpleadoHExtras(140, 1000, 10);
		EmpleadoAComision empComision = new EmpleadoAComision(121, 1000, 10, 1);
		
		Empresa LosTeclas = new Empresa();
		LosTeclas.setEmpleado(empContratado);
		LosTeclas.setEmpleado(empHEx);
		LosTeclas.setEmpleado(empComision);
		
		empHEx.addHorasExtras(3);
		empComision.addVentas(5);
		
		System.out.println("Sueldo empleado Contratado: $" + LosTeclas.getSueldo(empContratado));
		System.out.println("Sueldo empleado con Horas Extras: $" + LosTeclas.getSueldo(empHEx));
		System.out.println("Sueldo empleado con Comision: $" + LosTeclas.getSueldo(empComision));
	}

}
