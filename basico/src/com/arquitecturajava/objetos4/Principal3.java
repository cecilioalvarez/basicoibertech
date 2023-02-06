package com.arquitecturajava.objetos4;

public class Principal3 {

	public static void main(String[] args) {
		Monitor m= new Monitor(27,200);
		CPU c= new CPU(5,200);
		
		Ordenador o= new Ordenador(m,c);
		System.out.println(o.getPrecio());
		

	}

}
