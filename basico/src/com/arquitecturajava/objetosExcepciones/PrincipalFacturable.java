package com.arquitecturajava.objetosExcepciones;

public class PrincipalFacturable {

	public static void main(String[] args) {
		
		Caja c=new Caja(100);
		Caja c2= new Caja(200);	
		System.out.println(c.esMasUrgente(c2).importeTotal());
	}
}
