package menu;

import app.GestorEmpresa;
import dominio.*;
import enums.TipoContrato;

public class Main {
	
	public static void main(String[] args) {
        GestorEmpresa gestor = new GestorEmpresa();

        Departamento informatica = new Departamento("Informatica");
        Departamento recursosHumanos = new Departamento("RRHH");

        gestor.agregarDepartamento(informatica);
        gestor.agregarDepartamento(recursosHumanos);

        Empleado e1 = new EmpleadoFijo(1, "Ana", TipoContrato.FIJO, recursosHumanos, 2000);
        Empleado e2 = new EmpleadoPorHoras(2, "Luis", TipoContrato.TEMPORAL, informatica, 80, 15);
        Empleado e3 = new Directivo(3, "Carlos", TipoContrato.FIJO, informatica, 3000, 500);

        informatica.agregarEmpleado(e1);
        informatica.agregarEmpleado(e2);
        recursosHumanos.agregarEmpleado(e3);

        System.out.println("Coste informatica: " + informatica.calcularCosteTotal());
        System.out.println("Coste RRHH: " + recursosHumanos.calcularCosteTotal());
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }

}
