package com.arquitecturajava.objetos6;

public class Principal {

	public static void main(String[] args) {
	
		
		Persona d= new Deportista("juan",20,"tenis");
		imprimirDatos(d);

	}
	
	public static  void imprimirDatos(Persona persona) {
		
		System.out.println(persona.getNombre());
		System.out.println(persona.getEdad());
		
		
	}

}
