package com.arquitecturajava.objetos3;

public class Factura {

	private int numero;
	private double importe;

	public Factura(int numero, double importe) {
		super();
		this.numero = numero;
		this.importe = importe;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double getImporteConIVA() {

		return this.importe * 1.21;
	}

	public double getImporteConIVA(int porcentaje) {

		return this.importe + this.importe * porcentaje / 100;
	}

	public double getImporteConIVA(String tipo) {

		if (tipo.equals("reducido")) {

			return this.importe * 1.10;
		} else {
			return this.importe * 1.21;
		}

	}
}
