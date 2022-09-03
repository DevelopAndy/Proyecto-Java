
public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		double valorARetirar = valor + 0.2;
		super.retirar(valorARetirar);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}

}
