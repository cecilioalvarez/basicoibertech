package com.arquitecturajava.objetosExcepciones;

public class GestorTarea  implements AutoCloseable{
	
	public void hacerTarea() {
		
		System.out.println("estoy haciendo la tarea");
		
	}
	// tiene el metodo close
	public void close() {
		
		System.out.println("tarea finalizada cierre de recursos");
	}

}
