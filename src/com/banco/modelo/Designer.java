package com.banco.modelo;

public class Designer extends Empleado{

	@Override
	public double getBonificacion() {
		return this.salario * 0.1;
	}

}
