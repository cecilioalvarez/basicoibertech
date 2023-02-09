package com.arquitecturajava.objetos7;

public class Principal {

	public static void main(String[] args) {
		
		// tipo basico a un objeto
		int numero=5;
		double doble= 5.5;
		Integer numeroCoraza= Integer.valueOf(numero);
		Double dobleCoraza= Double.valueOf(doble);
		
		String numero3="7";
		
		int numero4=Integer.parseInt(numero3);
		System.out.println(numero4);
		
		String cadena1= Integer.toString(numero4);
		String cadena2=Integer.toString(numero4);
		System.out.println(cadena1+cadena2);
		
		
		
	}

}
