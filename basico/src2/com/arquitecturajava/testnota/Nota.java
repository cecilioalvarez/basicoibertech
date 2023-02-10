package com.arquitecturajava.testnota;

public class Nota {

	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Nota(double valor) {
		super();
		this.valor = valor;
	}

	public boolean estaAprobada() {

		return valor >= 5;
	}
}
