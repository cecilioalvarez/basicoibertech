package com.arquitecturajava.colecciones4;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

	private String dni;
	private String nombre;
	private int edad;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String dni, String nombre, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(o.getNombre());
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
	
}
