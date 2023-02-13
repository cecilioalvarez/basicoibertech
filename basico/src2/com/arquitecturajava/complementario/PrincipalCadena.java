package com.arquitecturajava.complementario;

public class PrincipalCadena {

	public static void main(String[] args) {
		
		Rectangulo r1= new Rectangulo(1,1);
		Rectangulo r2= new Rectangulo(1,1);
		Rectangulo r3=r1;
		
		System.out.println(r1.equals(r2));
		System.out.println(r1==r2);
		System.out.println(r1==r3);
	}
	
}
