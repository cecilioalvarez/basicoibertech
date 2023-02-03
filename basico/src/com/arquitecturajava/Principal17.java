package com.arquitecturajava;

public class Principal17 {

	public static void main(String[] args) {

		
	int[] minumero= new int[] {1};
	
	minumero[0]= minumero[0]+1;
	
	System.out.println(minumero[0]);
	
	incrementar(minumero);
	
	System.out.println(minumero[0]);
	}
	
	//objetos en java se pasan por referencia
	// los tipos basicos se pasan por valor
	// es decir se copian y por lo tanto no afectan
	// al manejo del programa principal
	
	public  static void incrementar( int[] lista) {
		
	
		lista[0]=lista[0]+1;
		
	}

}
