package dominio;

import enums.TipoContrato;
import interfaces.Incentivable;

public class EmpleadoFijo extends Empleado implements Incentivable{
	private double salarioBase;
	
	public EmpleadoFijo(int id, String nombre, TipoContrato contrato, double salarioBase) {
		super(id, nombre, contrato);
		this.salarioBase = salarioBase;
	}
	
    @Override
    public double calcularSalario() {
        return salarioBase + calcularIncentivo();
    }

    @Override
    public double calcularIncentivo() {
        return salarioBase * 0.1;
    }
    
    @Override
    public String toString() {
    		return String.format("ID: %d, Nombre: %s, Contrato: %s, Departamento: %s, Salario base: %.2f", id, nombre, contrato, departamento, salarioBase);
    }
}
