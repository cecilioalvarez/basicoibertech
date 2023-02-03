package com.arquitecturajava;

public class Principal4 {

	public static void main(String[] args) {

		// en un if se pueden combinar condiciones
		// al combinarlas se usa && para and
		// y la doble  || para el or
		
		int numero = 8;

		if (numero >= 0 && numero <= 3) {
			System.out.println("mal");

		} else if (numero > 3 && numero < 5) {
			System.out.println("regular");

		} else {
			System.out.println("bien");

		}

	}

}
