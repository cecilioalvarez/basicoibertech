package com.arquitecturajava.objetosComplemento3;

public class Principal2 {

	public static void main(String[] args) {
		
		Socio s= new SocioVip("juan");
		Socio s2= new SocioVip("pedro");
		
		System.out.println(s.equals(s2));
		
		System.out.println(s);
	}

}
