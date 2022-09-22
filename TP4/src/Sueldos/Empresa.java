package Sueldos;
import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> empleados;
	
	public Empresa() {
		empleados = new ArrayList<>();
	}
	
	public void setEmpleado(Empleado nuevoEmp) {
		this.empleados.add(nuevoEmp);
	}
	
	public double getSueldo (Empleado emp) {
		return emp.getSueldo();
	}

}
