package com.arquitecturajava.objetos2;

public class Princiopal {

	public static void main(String[] args) {
		
		// new para instanciar o construir un objeto
		
		Caja c= new Caja();
		c.setPeso(2);
		c.setLado1(20);
		c.setLado2(2);
		c.setLado3(2);

		System.out.println(c.getLado1());
		System.out.println(c.volumen());

	}

}
