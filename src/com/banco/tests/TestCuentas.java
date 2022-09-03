package com.banco.tests;
import com.banco.modelo.CuentaAhorros;
import com.banco.modelo.CuentaCorriente;
import com.banco.modelo.SaldoInsuficienteException;

public class TestCuentas {

	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CuentaAhorros ca = new CuentaAhorros(1, 2);
		
		cc.setSaldo(1000);
		ca.setSaldo(500);
		
		try {
			cc.retirar(800);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		System.out.println(cc);
		System.out.println(ca);
	}
}
