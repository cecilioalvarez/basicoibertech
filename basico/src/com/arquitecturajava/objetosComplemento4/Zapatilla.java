package com.arquitecturajava.objetosComplemento4;

public class Zapatilla implements Calzado {

	private String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double mejoraVelocidad() {
		
		return 1;
	}
}
