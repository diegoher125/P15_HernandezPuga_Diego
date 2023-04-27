package main.java.ieseuropa;

public class Trabajo {

	private int id;
	private String descripcion;
	private boolean finalizado;
	private int horas;
	private float precio;

	public Trabajo(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
		this.finalizado = false;
		this.horas = 0;
		this.precio = 30;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String finalizar() {
		if (!finalizado) {
			finalizado = true;
			return "Finalizado";
		} else {
			return "ERROR: El trabajo ya esta finalizado";
		}
	}
	
	public String aumentarHoras(int horas) {
		if (!finalizado) {
			this.horas += horas;
			return "Horas aumentadas";
		} else {
			return "ERROR: El trabajo ya esta finalizado";
		}
	}
	
	public String aumentarCostePiezas(float coste) {
			return "";
	}

	public String muestra() {
		return "El identificador es " + id + "\nLa descripcion es: " + descripcion + muestraFin()
		+ "\nEl precio del trabajo es " + (Math.round((calcularPrecio()) * 100.0) / 100.0) + "€";
	}

	private float calcularPrecio() {
		return precio * horas;
	}

	private String muestraFin() {
		if (finalizado) {
			return "\nEl estado del trabajo es finalizado";
		} else {
			return "\nEl estado del trabajo es no finalizado";
		}
	}

	@Override
	public boolean equals(Object o) {
		if (id == ((Trabajo) o).id) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Trabajo [id=" + id + ", descripcion=" + descripcion + ", finalizado=" + finalizado + ", horas=" + horas
				+ ", precio=" + precio + "]";
	}

}
