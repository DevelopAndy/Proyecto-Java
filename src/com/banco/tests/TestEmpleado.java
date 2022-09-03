package com.banco.tests;
import com.banco.modelo.Empleado;
import com.banco.modelo.Gerente;

public class TestEmpleado {
	
	public static void main(String[] args) {
		
		Empleado empleado1 = new Gerente();
		empleado1.setNombre("Andy");
		empleado1.setDocumentoIdentidad("1098768");
		empleado1.setSalario(1000);
		
		System.out.println(empleado1.getNombre());
		System.out.println(empleado1.getBonificacion());
	}
}
