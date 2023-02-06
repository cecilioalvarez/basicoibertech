package com.arquitecturajava.objetos2;

public class Princiopal2 {

	public static void main(String[] args) {
		
		// new para instanciar o construir un objeto
		
		Persona p= new Persona();
		p.setNombre("pedro");
		p.setEdad(20);
		System.out.println(p.esMayorDeEdad());

	}

}
