package com.banco.modelo;

/**
 * La clase cuenta contiene los metodos para las cuentas hija
 * 
 * @author Andy
 *
 */

public abstract class Cuenta {
	//Attributes
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
	/**
	 * El constructor inicializa el objeto cuenta y utiliza los siguientes parametros
	 * @param agencia es el id de la agencia
	 * @param numero es el id de la cuenta
	 */
	//Constructor
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		total ++;;
	}
	
	//Setters and Getters	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
	//Methods	
	
	public abstract void depositar(double valor);
	
	/**
	 * Metodo que permite retirar dinero solo si el valor a retirar es menor al saldo de la cuenta
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void retirar(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("No tienes saldo");
		}
		this.saldo -= valor;
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if(this.saldo >= valor) {
			try {
				this.retirar(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
			cuenta.setSaldo(valor);
			return true;
		}
		return false;
	}

}
