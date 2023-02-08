package com.arquitecturajava.objetosComplemento7;

public class Bombilla implements Encendible  {

	private boolean encendida;

	public boolean isEncendida() {
		return encendida;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public Bombilla(boolean encendida) {
		super();
		this.encendida = encendida;
	}
	

	@Override
	public void on() {
		
		this.encendida=true;
	}
	
	
	@Override
	public void off () {
		
		this.encendida=false;
	}
	
}
