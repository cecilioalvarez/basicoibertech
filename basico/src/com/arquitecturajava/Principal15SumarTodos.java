package com.arquitecturajava;

import java.util.stream.IntStream;

public class Principal15SumarTodos {

	public static void main(String[] args) {

		int[] lista = new int[] { 5, 4, 2, 1, 7, 8, 2 };
		int suma = sumar(lista);
		System.out.println(suma);
		System.out.println(sumarDosNumeros(2, 3));
	}

	// tiene un nombre , tiene un parametro de entrada
	// tiene un retorno con el resultado
	
	private static int sumar(int[] lista) {
		int suma = 0;

		for (int j = 0; j < lista.length; j++) {
			suma = suma + lista[j];
		}
		return suma;
	}
	
	static int sumarDosNumeros(int a , int b) {
		
		return a+b;
	}
	

}
