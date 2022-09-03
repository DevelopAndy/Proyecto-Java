
public class TestCuentas {

	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CuentaAhorros ca = new CuentaAhorros(1, 2);
		
		cc.setSaldo(1000);
		ca.setSaldo(500);
		
		try {
			cc.retirar(1500);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		cc.transferir(1500, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
}
