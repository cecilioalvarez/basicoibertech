package com.arquitecturajava.testnota2;

import java.util.Objects;

public class Nota implements Comparable<Nota> {

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

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	@Override
	public int compareTo(Nota nota) {

		if (this.getValor() > nota.getValor()) {

			return 1;
		} else if (this.getValor() == nota.getValor()) {
			return 0;
		} else {
			return -1;
		}
	}

}
