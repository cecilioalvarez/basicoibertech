package com.arquitecturajava;

public class Principal18 {

	public static void main(String[] args) {

		
	int minumero=2;
	System.out.println(minumero);
	minumero++;
	
	System.out.println(minumero);
		
	// llamado a incremntar
	// lo que haces es incrementar la copia no
	// su valor original
	incrementar(minumero);
	
	System.out.println(minumero);
	
	}
	
	// un tipo basico en java a una funcion
	// se le pasa por valor
	// es decir se realiza una copia del valor orieginal
	// por lo tanto la funcion tiene una copia
	
	public  static void incrementar( int numero) {
		
		// si esto es una copia
		numero++;
		
	}

}
