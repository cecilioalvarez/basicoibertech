package com.arquitecturajava.objetosComplemento6;

public class Pack2Regalos {
	
	private Regalo regaloA;
	private Regalo regaloB;
	
	public Regalo getRegaloA() {
		return regaloA;
	}
	public void setRegaloA(Regalo regaloA) {
		this.regaloA = regaloA;
	}
	public Regalo getRegaloB() {
		return regaloB;
	}
	public void setRegaloB(Regalo regaloB) {
		this.regaloB = regaloB;
	}
	public Pack2Regalos(Regalo regaloA, Regalo regaloB) {
		super();
		this.regaloA = regaloA;
		this.regaloB = regaloB;
	}
	
	
	public double getPrecio() {
		return regaloA.getPrecio()+ regaloB.getPrecio();
	}
	
	public Regalo getRegaloMasCaro() {
		
		return regaloA.getPrecio()>regaloB.getPrecio()? regaloA:regaloB;
	}

}
