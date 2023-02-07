package com.arquitecturajava.objetos6;

public class Informatico extends Persona {

	public Informatico(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	
	public void programar() {
		
		System.out.println("el informatico programa");
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		System.out.println("no anda");
	}
	
	

}
