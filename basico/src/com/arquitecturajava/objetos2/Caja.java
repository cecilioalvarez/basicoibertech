package com.arquitecturajava.objetos2;

public class Caja {

	private double peso;
	private int lado1;
	private int lado2;
	private int lado3;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		if (lado1 < 10) {
			this.lado1 = lado1;
		} else {
			this.lado1 = 10;
		}

	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		if (lado2 < 10) {
			this.lado2 = lado2;
		} else {
			this.lado2 = 10;
		}

	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		if (lado3 < 10) {

			this.lado3 = lado3;
		} else {
			this.lado3 = 10;
		}

	}

	int volumen() {

		return getLado1() * getLado2() * getLado3();
	}

}
