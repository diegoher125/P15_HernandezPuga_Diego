package main.java.ieseuropa;

public class ReparacionChapaPintura extends Reparacion {

	public ReparacionChapaPintura(int id, String descripcion) {
		super(id, descripcion);
	}
	
	private float calcularPrecio() {
		return ((getPrecio() * getHoras()) + getPrecioMaterial()) * 1.3f;
	}

}
