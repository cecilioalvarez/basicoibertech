package com.arquitecturajava.objetos7;

public class Telefono implements Conectable{

	private double precio;
	private boolean estado;
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public Telefono() {
		super();
	}
	public void on() {
		estado=true;
	}
	public void off() {
		estado=false;
	}
	public Telefono(double precio, boolean estado) {
		super();
		this.precio = precio;
		this.estado = estado;
	}
	
}
