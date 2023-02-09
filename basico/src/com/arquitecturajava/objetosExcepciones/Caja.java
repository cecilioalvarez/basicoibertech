package com.arquitecturajava.objetosExcepciones;

public class Caja implements Facturable {

	private double importe;
	
	
	
	public Caja(double importe) {
		super();
		this.importe = importe;
	}



	@Override
	public double importeTotal() {
		// TODO Auto-generated method stub
		return importe;
	}

}
