package Empresa;

public class Main {

	public static void main(String[] args) {
		Usuario user = new Usuario("Pepe", "Flores", 32, "usuario", "pepito", "*%8975gjjl") ;
		Empleado emp = new Empleado("Juan", "Perez", 30, "empleado", 18182, 1000);
		Jerarquico jer = new Jerarquico("Liz", "Taylor", 60, "jerarquico", 1812, 5000);
		
		jer.setPersonaACargo(user);
		jer.setPersonaACargo(emp);
		
		Empresa LosTeclas = new Empresa();
		
		LosTeclas.cargarEmpleado(jer);
		LosTeclas.cargarEmpleado(user);
		LosTeclas.cargarEmpleado(emp);
		
		System.out.println(LosTeclas.MostrarListaDeEmpleados());
	}

}
