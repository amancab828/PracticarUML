package dominio;

import enums.TipoContrato;

public class EmpleadoPorHoras extends Empleado{
	private int horasTrabajadas;
	private double precioHora;
	
	public EmpleadoPorHoras(int id, String nombre, TipoContrato contrato, int horasTrabajadas, double precioHora) {
		super(id, nombre, contrato);
		this.horasTrabajadas = horasTrabajadas;
		this.precioHora = precioHora;
	}
	
    @Override
    public double calcularSalario() {
        return horasTrabajadas * precioHora;
    }
    
    @Override
    public String toString() {
    		return String.format("ID: %d, Nombre: %s, Contrato: %s, Departamento: %s, Horas trabajadas: %d, Precio hora: %.2f", id, nombre, contrato, departamento, horasTrabajadas, precioHora);
    }
}
