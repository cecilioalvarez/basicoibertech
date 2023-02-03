package com.arquitecturajava;

import java.util.stream.IntStream;

public class Principal12 {

	public static void main(String[] args) {

		// una lista de 4 elementos
		// los arrays comienzan en 0
		// tienen una propiedad length para saber 
		// su tope
		// con los corchetes sobre la variable 
		//  se accede a la posicion
		
		
		int[] lista= new int[] { 5,4,2,1};
		
		for (int i=0;i<lista.length;i++) {
			
			System.out.println(lista[i]);
		}

	}

}
