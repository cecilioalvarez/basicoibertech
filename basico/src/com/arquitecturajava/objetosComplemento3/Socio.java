package com.arquitecturajava.objetosComplemento3;

public abstract class Socio {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Socio(String nombre) {
		super();
		this.nombre = nombre;
	}

	public abstract double cuotaMensual();

}
