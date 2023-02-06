package com.arquitecturajava.objetos5;

public class Principal {

	public static void main(String[] args) {
	
		
		Baldosa b1= new Baldosa(2,"azul");
		Baldosa b2= new Baldosa(2,"amarilla");
		Baldosa b3= new Baldosa(2,"verde");
		Baldosa b4= new Baldosa(2,"verde");
		Baldosa b5= new Baldosa(2,"verde");
		Baldosa b6= new Baldosa(2,"azul");

		Suelo s= new Suelo();
		s.addBaldosa(b1);
		s.addBaldosa(b2);
		s.addBaldosa(b3);
		s.addBaldosa(b4);
		s.addBaldosa(b5);
		s.addBaldosa(b6);
		System.out.println(s.colorMasRepetido());
		
	}

}
