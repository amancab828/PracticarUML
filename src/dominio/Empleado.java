package dominio;

import enums.TipoContrato;

public abstract class Empleado extends Persona{
	protected TipoContrato contrato;
	protected Departamento departamento;
	
	public Empleado(int id, String nombre, TipoContrato contrato, Departamento departamento) {
		super(id, nombre);
		this.contrato = contrato;
		this.departamento = departamento;
	}
	
	public abstract double calcularSalario();
	
	public void setDepartamento(Departamento d) {
		this.departamento = d;
	}
}
