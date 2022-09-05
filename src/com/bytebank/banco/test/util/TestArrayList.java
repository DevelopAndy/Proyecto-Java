package com.bytebank.banco.test.util;

import java.util.ArrayList;

import com.banco.modelo.Cuenta;
import com.banco.modelo.CuentaCorriente;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
		
		Cuenta cc1 = new CuentaCorriente(22, 22);
        Cuenta cc2 = new CuentaCorriente(22, 22);
        
        lista.add(cc1);
        
        boolean existe = lista.equals(cc2);
        
        System.out.println("Ya existe? "+existe);

        for(Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

    }
}
