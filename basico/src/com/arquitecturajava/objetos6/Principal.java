package com.arquitecturajava.objetos6;

public class Principal {

	public static void main(String[] args) {
	
		
		Deportista d= new Deportista("juan",20,"tenis");
		Informatico i= new Informatico("david",30);
		imprimirDatos(d);
		imprimirDatos(i);
		andar(d);
		andar(i);
		

	}
	
	//flexibilidad
	// emcapsulacion
	// el que construye este metodo
	// no le hace falta saber que hay una jerarquia
	public static  void imprimirDatos(Persona persona) {
		
		System.out.println(persona.getNombre());
		System.out.println(persona.getEdad());
		
		
	}

	public static void andar(Persona persona) {
		//objeto que tengamso
		persona.andar();
	}
	
}
