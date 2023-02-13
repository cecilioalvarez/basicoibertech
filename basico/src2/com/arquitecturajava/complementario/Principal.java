package com.arquitecturajava.complementario;

public class Principal {

	public static void main(String[] args) {
		
		Rectangulo r= new Rectangulo(2,2);
		Rectangulo r2= new Rectangulo(2,2);
		Rectangulo r3= new Rectangulo(2,2);
		System.out.println(Rectangulo.getContador());
	
		System.out.println(r.area());
		//porque
		System.out.println(Rectangulo.area(2, 2));

	}

}
