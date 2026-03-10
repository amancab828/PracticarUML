package dominio;

import enums.TipoContrato;
import interfaces.Incentivable;

public class Directivo extends Empleado implements Incentivable{
	private double salarioBase;
	private double bonus;
	
	public Directivo(int id, String nombre, TipoContrato contrato, Departamento departamento, double salarioBase, double bonus) {
		super(id, nombre, contrato, departamento);
		this.salarioBase = salarioBase;
		this.bonus = bonus;
	}
	
    @Override
    public double calcularSalario() {
        return salarioBase + bonus + calcularIncentivo();
    }

    @Override
    public double calcularIncentivo() {
        return salarioBase * 0.1;
    }
    
    @Override
    public String toString() {
    		return String.format("ID: %d, Nombre: %s, Contrato: %s, Departamento: %s, Salario base: %.2f, Bonus: %.2f", id, nombre, contrato, departamento, salarioBase, bonus);
    }
}
