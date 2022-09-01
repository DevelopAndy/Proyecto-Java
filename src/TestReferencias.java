
public class TestReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNombre("Alberto");
		g1.setSalario(1000);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(500);
		
		Designer d1 = new Designer();
		d1.setSalario(800);
		
		ControlBonificacion cb1 = new ControlBonificacion();
		cb1.registrar(d1);
		cb1.registrar(ev1);
		cb1.registrar(d1);
		
		System.out.println(cb1.getSuma());
	}
}
