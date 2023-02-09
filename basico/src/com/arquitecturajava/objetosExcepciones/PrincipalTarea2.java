package com.arquitecturajava.objetosExcepciones;

public class PrincipalTarea2 {

	public static void main(String[] args) {
		
		
		
		
		
		try (GestorTarea tarea= new GestorTarea();){
			
			
			tarea.hacerTarea();
			throw new ArithmeticException();
			
		}catch  (Exception e) {
			
			System.out.println("ha ocurrido un problema");
		}

	}

}
