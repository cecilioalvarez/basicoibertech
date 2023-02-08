package com.arquitecturajava.objetosComplemento6;

public class Regalo {

	private String nombre;
	private double precio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Regalo(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
}
