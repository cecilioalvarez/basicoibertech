package com.arquitecturajava;

public class Principal20Factorial {

	public static void main(String[] args) {
		

		System.out.println(factorial(5));
	}
	
	public static int factorial (int numero) {
		
		int total=1;
		
		for (int i=1;i<=numero;i++) {
			
			total=total*i;
		}
		return total;
	}

}
