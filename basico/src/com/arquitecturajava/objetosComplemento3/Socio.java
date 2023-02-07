package com.arquitecturajava.objetosComplemento3;

import java.util.Objects;

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
	
	
	

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public abstract double cuotaMensual();

}
