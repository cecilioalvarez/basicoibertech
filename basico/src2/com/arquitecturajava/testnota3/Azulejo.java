package com.arquitecturajava.testnota3;

public class Azulejo {

	private double lado;
	private double peso;

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Azulejo(double lado, double peso) {
		super();
		this.lado = lado;
		this.peso = peso;
	}
	public Azulejo(double lado) {
		super();
		this.lado = lado;
		this.peso=1;
		
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double area() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
	public double perimetro() {
		// TODO Auto-generated method stub
		return lado*4;
	}

}
