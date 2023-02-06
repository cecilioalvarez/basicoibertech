package com.arquitecturajava.objetos5;

public class Baldosa {

	private double precio;
	
	private String color;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Baldosa(double precio, String color) {
		super();
		this.precio = precio;
		this.color = color;
	}
	
	
}
