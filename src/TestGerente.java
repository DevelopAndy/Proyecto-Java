
public class TestGerente {

	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		gerente1.setNombre("Bayona");
		gerente1.setDocumentoIdentidad("10987384");
		gerente1.setSalario(3000);
		
		System.out.println(gerente1.getNombre());
		System.out.println(gerente1.getDocumentoIdentidad());
		System.out.println(gerente1.getSalario());

		
		System.out.println(gerente1.iniciarSesion("2222"));
		System.out.println(gerente1.getBonificacion());
	}
}
