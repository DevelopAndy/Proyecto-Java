package com.banco.tests;

import com.banco.modelo.Cuenta;
import com.banco.modelo.CuentaCorriente;
import com.banco.modelo.GuardadorDeCuentas;

public class TestGuardadorDeCuentas {

	public static void main(String[] args) {
		
		GuardadorDeCuentas guardador = new GuardadorDeCuentas();
		
		Cuenta cc1 = new CuentaCorriente(22, 11);		
		guardador.adicionar(cc1);
		
		Cuenta cc2 = new CuentaCorriente(11, 22);		
		guardador.adicionar(cc2);
		
		int tamano = guardador.getCantidadDeElementos();
		System.out.println(tamano);
		
		Cuenta ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());
	}
}
