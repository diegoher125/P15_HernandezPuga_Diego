package main.java.ieseuropa;

public class ReparacionMecanica extends Reparacion {

	public ReparacionMecanica(int id, String descripcion) {
		super(id, descripcion);
	}
	
	@Override
	public float calcularPrecio() {
		return ((getPrecio() * getHoras()) + getPrecioMaterial()) * 1.1f;
	}

}
