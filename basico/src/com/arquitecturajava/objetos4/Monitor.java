package com.arquitecturajava.objetos4;

public class Monitor {

	private int pulgadas;
	private double precio;
	
	
	public Monitor(int pulgadas, double precio) {
		super();
		this.pulgadas = pulgadas;
		this.precio = precio;
	}
	public int getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
