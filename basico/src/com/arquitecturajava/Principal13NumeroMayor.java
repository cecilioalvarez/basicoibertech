package com.arquitecturajava;

import java.util.stream.IntStream;

public class Principal13NumeroMayor {

	public static void main(String[] args) {

		int[] lista = new int[] { 5, 4, 2, 1, 7, 8, 2 };

		int mayor=0;
		
		for (int i = 0; i < lista.length; i++) {

			if (lista[i]>mayor) mayor=lista[i];
		}

		System.out.println(mayor);
	}

}
