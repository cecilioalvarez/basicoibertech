package com.arquitecturajava.objetosComplemento4;

public class Corredor {

	
	private String nombre;
	private Calzado calzado;
	private double velocidad;
	
	
	public Corredor(String nombre, Calzado calzado, double velocidad) {
		super();
		this.nombre = nombre;
		this.calzado = calzado;
		this.velocidad = velocidad;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	
	public Calzado getCalzado() {
		return calzado;
	}
	public void setCalzado(Calzado calzado) {
		this.calzado = calzado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void correr() {
		
		double velocidadTotal=velocidad+calzado.mejoraVelocidad();
		System.out.println("el corredor corre :"+velocidadTotal);
	}
}
