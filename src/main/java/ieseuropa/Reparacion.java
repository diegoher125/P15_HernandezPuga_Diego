package main.java.ieseuropa;

public abstract class Reparacion extends Trabajo {
	
	private float precioMaterial;

	public Reparacion(int id, String descripcion) {
		super(id, descripcion);
		this.precioMaterial = 0;
	}

	public float getPrecioMaterial() {
		return precioMaterial;
	}

	public void setPrecioMaterial(float precioMaterial) {
		this.precioMaterial = precioMaterial;
	}
	
	public String aumentarCostePiezas(float coste) {
		if (!isFinalizado()) {
			this.precioMaterial += coste;
			return "Coste aumentado";
		} else {
			return "ERROR: El trabajo ya esta finalizado";
		}
	}

	@Override
	public String toString() {
		return "Reparacion [precioMaterial=" + precioMaterial + ", getId()=" + getId() + ", getDescripcion()="
				+ getDescripcion() + ", isFinalizado()=" + isFinalizado() + ", getHoras()=" + getHoras()
				+ ", getPrecio()=" + getPrecio() + "]";
	}
	

}
