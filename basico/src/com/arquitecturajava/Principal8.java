package com.arquitecturajava;

import java.util.Arrays;

public class Principal8 {

	public static void main(String[] args) {

		String[] lista = new String[] { "hola", "que", "tal" };

		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);

		}
		// foreach por cada elemento tratalo
		
		for (String texto:lista) {
			
			System.out.println(texto);
		}
		
		//programación funcional 
		
		Arrays.stream(lista).forEach(System.out::println);
	}

}
