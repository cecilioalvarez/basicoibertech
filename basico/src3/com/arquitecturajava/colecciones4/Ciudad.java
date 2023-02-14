package com.arquitecturajava.colecciones4;

public class Ciudad {

	private String nombre;
	private int habitantes;
	
	public Ciudad(String nombre, int habitantes) {
		super();
		this.nombre = nombre;
		this.habitantes = habitantes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", habitantes=" + habitantes + "]";
	}
	
	
}
