package com.arquitecturajava;

import java.util.stream.IntStream;

public class Principal15SumarTodos {

	public static void main(String[] args) {

		int[] lista = new int[] { 5, 4, 2, 1, 7, 8, 2 };
		int suma = 0;

		for (int j = 0; j < lista.length; j++) {
			suma = suma + lista[j];
		}
		System.out.println(suma);
	}

}
