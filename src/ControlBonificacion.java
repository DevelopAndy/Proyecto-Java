
public class ControlBonificacion {

	private double suma;
	
	public void registrar(Empleado e) {
		double boni = e.getBonificacion();
		this.suma += boni;
	}
	
	public double getSuma() {
		return this.suma;
	}
}
