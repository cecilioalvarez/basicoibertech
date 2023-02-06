package com.arquitecturajava.objetos3;

public class Princiopal3 {

	public static void main(String[] args) {
		
		// new para instanciar o construir un objeto
	
		Cuadro c= new Cuadro("amacener",2,2,1);
		System.out.println(c.getSuperficie());
		
		Cuadro c2= new Cuadro("amacener",2,2);
		System.out.println(c2.getSuperficie());
	}

}
