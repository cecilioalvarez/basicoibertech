package com.arquitecturajava.objetosExcepciones;

public class PrincipalTarea {

	public static void main(String[] args) {
		
		
		GestorTarea tarea= new GestorTarea();	
		
		
		try {
			
			
			tarea.hacerTarea();
			throw new ArithmeticException();
			
		}catch  (Exception e) {
			
			System.out.println("ha ocurrido un problema");
		}finally {
			
			if (tarea!=null) {
				tarea.close();
			}
		}

	}

}
