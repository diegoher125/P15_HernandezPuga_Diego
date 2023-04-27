package main.java.ieseuropa;

import java.util.ArrayList;

public class Taller {
	
	private ArrayList<Trabajo> trabajos;
	
	public Taller() {
		trabajos = new ArrayList<>();
	}

	public ArrayList<Trabajo> getTrabajos() {
		return trabajos;
	}

	public void setTrabajos(ArrayList<Trabajo> trabajos) {
		this.trabajos = trabajos;
	}
	
	public String nuevoTrabajo(String descripcion, int tipo) {
		switch(tipo) {
		case 1:
			trabajos.add(new ReparacionMecanica(trabajos.size(), descripcion));
			return "El identificador es el " + (trabajos.size()-1);
		case 2:
			trabajos.add(new ReparacionChapaPintura(trabajos.size(), descripcion));
			return "El identificador es el " + (trabajos.size()-1);
		case 3:
			trabajos.add(new Revision(trabajos.size(), descripcion));
			return "El identificador es el " + (trabajos.size()-1);
		default:
			return "";
		}
	}
	
	public String finalizarTrabajo(int id) {
		if(isIdCorrecto(id)) {
			return trabajos.get(id).finalizar();
		}else {
			return "ERROR: El identificador del trabajo es incorrecto";
		}
	}
	
	public String aumentarHorasTrabajo(int id, int horas) {
		if(isIdCorrecto(id)) {
			return trabajos.get(id).aumentarHoras(horas);
		}else {
			return "ERROR: El identificador del trabajo es incorrecto";
		}
	}
	
	public String aumentarCostePiezasTrabajo(int id, float coste) {
		if(isIdCorrecto(id)) {
			return trabajos.get(id).aumentarCostePiezas(coste);
		}else {
			return "ERROR: El identificador del trabajo es incorrecto";
		}
	}
	
	private boolean isIdCorrecto(int id) {
		if(id < trabajos.size() || id > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public String muestraTrabajo(int id) {
		if(isIdCorrecto(id)) {
			return trabajos.get(id).muestra() + tipoTrabajo(id);
		}else {
			return "ERROR: El identificador del trabajo es incorrecto";
		}
	}
	
	private String tipoTrabajo(int id) {
		if(trabajos.get(id) instanceof ReparacionMecanica) {
			return "\nEl tipo de trabajo es reparacion mecanica";
		}else if(trabajos.get(id) instanceof ReparacionChapaPintura) {
			return "\nEl tipo de trabajo es reparacion de chapa y pintura";
		}else {
			return "\nEl tipo de trabajo es revision";
		}
	}

	@Override
	public String toString() {
		return "Taller [trabajos=" + trabajos + "]";
	}

}
