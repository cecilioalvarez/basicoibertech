package com.arquitecturajava.objetos4;

public class CPU {

	private double potencia;
	private double precio;
	
	
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public CPU(double potencia, double precio) {
		super();
		this.potencia = potencia;
		this.precio = precio;
	}
	
	
}
