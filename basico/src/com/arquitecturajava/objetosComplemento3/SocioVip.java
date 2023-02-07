package com.arquitecturajava.objetosComplemento3;

public class SocioVip extends Socio {

	public SocioVip(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cuotaMensual() {
		// TODO Auto-generated method stub
		return 60;
	}

}
