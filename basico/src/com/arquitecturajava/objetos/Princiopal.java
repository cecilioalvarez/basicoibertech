package com.arquitecturajava.objetos;

public class Princiopal {

	public static void main(String[] args) {
		
		// new para instanciar o construir un objeto
		
		Caja c= new Caja();
		c.peso=20;
		c.lado1=2;
		c.lado2=4;
		c.lado3=7;

		System.out.println(c.peso);
		System.out.println(c.volumen());

	}

}
