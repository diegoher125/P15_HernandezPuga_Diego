package main.java.ieseuropa;

public abstract class Reparacion extends Trabajo {
	
	private float precioMaterial;
	private float precio;

	public Reparacion(int id, String descripcion) {
		super(id, descripcion);
		this.precioMaterial = 0;
		this.precio = 30;
	}

	public float getPrecioMaterial() {
		return precioMaterial;
	}

	public void setPrecioMaterial(float precioMaterial) {
		this.precioMaterial = precioMaterial;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
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
				+ ", precio=" + precio + "]";
	}
	

}
