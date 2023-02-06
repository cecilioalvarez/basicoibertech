package com.arquitecturajava.objetos3;

public class Princiopal2 {

	public static void main(String[] args) {
		
		// new para instanciar o construir un objeto
		
		Persona p= new Persona("pedro",20);
		System.out.println(p.esMayorDeEdad());
		System.out.println(p.esMayorDeEdad(21));

	}

}
