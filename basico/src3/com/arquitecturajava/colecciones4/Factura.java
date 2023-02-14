package com.arquitecturajava.colecciones4;

public class Factura {

	private String numero;
	private double importe;
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Factura(String numero, double importe) {
		super();
		this.numero = numero;
		this.importe = importe;
	}
	
	
}
