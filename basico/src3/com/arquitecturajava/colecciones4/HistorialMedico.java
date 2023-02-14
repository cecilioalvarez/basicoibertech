package com.arquitecturajava.colecciones4;

public class HistorialMedico {

	private String dni;
	private String enfermedad;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	public HistorialMedico(String dni, String enfermedad) {
		super();
		this.dni = dni;
		this.enfermedad = enfermedad;
	}
	
	
}
