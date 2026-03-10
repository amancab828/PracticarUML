package dominio;

import enums.TipoContrato;

public abstract class Empleado extends Persona{
	protected TipoContrato contrato;
	protected Departamento departamento;
	
	public Empleado(int id, String nombre, TipoContrato contrato) {
		super(id, nombre);
		this.contrato = contrato;
	}
	
	public abstract double calcularSalario();
	
	public void setDepartamento(Departamento d) {
		this.departamento = d;
	}
}
