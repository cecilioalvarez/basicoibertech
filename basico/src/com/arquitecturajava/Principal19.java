package com.arquitecturajava;

public class Principal19 {

	public static void main(String[] args) {

		//consola el numero total de aprobados
		//utilizando una funcion
		// construimos una funcion que recibe el 
		//array
		
		int[] lista = new int[] { 5, 4, 2, 1, 7, 8, 2 };
		
		int contador = 0;
		
		for (int i=0;i<lista.length;i++) {
			
			if (lista[i]>=5) {
				
				contador++;
			}
		}
		
		System.out.println(contador);
		
		
	}

}
