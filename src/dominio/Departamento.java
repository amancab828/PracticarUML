package dominio;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nombre;
	private List<Empleado> empleados;
	
	public Departamento(String nombre) {
		this.nombre = nombre;
		this.empleados = new ArrayList<>();
	}
	
	public void agregarEmpleado(Empleado e) {
		empleados.add(e);
	}
	
	public double calcularCosteTotal() {
		double total = 0;
		
		for (Empleado empleado : empleados) {
			total += empleado.calcularSalario();
		}
		
		return total;
	}
}
