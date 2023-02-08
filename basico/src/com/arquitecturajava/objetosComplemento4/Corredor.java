package com.arquitecturajava.objetosComplemento4;

public class Corredor {

	
	private String nombre;
	private Zapatilla zapatilla;
	private double velocidad;
	
	
	public Corredor(String nombre, Zapatilla zapatilla, double velocidad) {
		super();
		this.nombre = nombre;
		this.zapatilla = zapatilla;
		this.velocidad = velocidad;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public Zapatilla getZapatilla() {
		return zapatilla;
	}
	public void setZapatilla(Zapatilla zapatilla) {
		this.zapatilla = zapatilla;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void correr() {
		
		System.out.println("el corredor corre a 9 km/hora");
	}
}
