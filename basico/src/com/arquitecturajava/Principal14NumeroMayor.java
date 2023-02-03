package com.arquitecturajava;

import java.util.stream.IntStream;

public class Principal14NumeroMayor {

	public static void main(String[] args) {

		int[] lista = new int[] { 5, 4, 2, 1, 7, 8, 2 };
		int i=0;
		
		int mayor=lista[0];
		
		int longitud=lista.length;
		
		while (i<longitud){

			if (lista[i]>mayor) mayor=lista[i];
			i++;
		}

		System.out.println(mayor);
	}

}
