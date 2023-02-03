package com.arquitecturajava;

public class Principal5 {

	public static void main(String[] args) {

		// en un if se pueden combinar condiciones
		// al combinarlas se usa && para and
		// y la doble || para el or

		int numero = 8;

		if (numero > 10 || numero < 0) {
			System.out.println("no es valido");
		} else {
			System.out.println("es valido");

		}
	}

}
