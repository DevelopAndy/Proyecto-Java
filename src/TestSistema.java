
public class TestSistema {

	public static void main(String[] args) {
		 Gerente g1 = new Gerente();
		 
		 g1.iniciarSesion("22222");
		 
		 SistemaInterno si = new SistemaInterno();
		 si.autentica(g1);
	}
}
