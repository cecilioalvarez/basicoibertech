package com.arquitecturajava.testnota3;

import java.util.Objects;

public class Azulejo {

	private double lado;
	private double peso;
	
	

	@Override
	public int hashCode() {
		return Objects.hash(lado, peso);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Azulejo other = (Azulejo) obj;
		return Double.doubleToLongBits(lado) == Double.doubleToLongBits(other.lado)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}
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
