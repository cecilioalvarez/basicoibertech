package com.arquitecturajava.objetos2;

public class Princiopal {

	public static void main(String[] args) {
		
		// new para instanciar o construir un objeto
		
		Caja c= new Caja();
		c.setPeso(20);
		c.setLado1(2);
		c.setLado2(4);
		c.setLado3(7);

		System.out.println(c.getPeso());
		System.out.println(c.volumen());

	}

}
