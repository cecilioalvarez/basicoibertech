package com.arquitecturajava.objetos3;

public class Princiopal {

	public static void main(String[] args) {
		
		// new para instanciar o construir un objeto
		
		Caja c= new Caja(2,20,2,2);

		System.out.println(c.getLado1());
		System.out.println(c.volumen());

	}

}
