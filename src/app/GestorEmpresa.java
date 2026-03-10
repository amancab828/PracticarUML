package app;

import java.util.ArrayList;
import java.util.List;

import dominio.Departamento;

public class GestorEmpresa {
	private List<Departamento> departamentos;
	
	public GestorEmpresa() {
		this.departamentos = new ArrayList<>();
	}
	
	public void agregarDepartamento(Departamento d) {
		departamentos.add(d);
	}
}
