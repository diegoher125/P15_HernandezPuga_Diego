package main.java.ieseuropa;

public class Revision extends Trabajo {

	public Revision(int id, String descripcion) {
		super(id, descripcion);
	}
	
	public String aumentarCostePiezas(float coste) {
		return "ERROR: El trabajo no es una reparacion";
	}
	
	@Override
	public float calcularPrecio() {
		return 20;
	}

}
