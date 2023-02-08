package com.arquitecturajava.objetosComplemento6;

public class Principal {

	public static void main(String[] args) {
		
		
		Regalo a= new Regalo("perfume",20);
		Regalo b= new Regalo("auricular",100);
		
		Regalo c= new Regalo("crema",10);
		Regalo d= new Regalo("balon",20);
		Regalo e= new Regalo("chocolate",5);
		
		
		Pack2Regalos pack= new Pack2Regalos(a, b);
		Pack2Regalos pack2= new Pack2Regalos(c, d);
		
		
		Caja caja= new Caja(pack,pack2,e);

		
		System.out.println(caja.getPrecio());

		System.out.println(caja.esMasCaro().getPrecio());
		System.out.println(caja.esMasCaro().getNombre());
	}

}
