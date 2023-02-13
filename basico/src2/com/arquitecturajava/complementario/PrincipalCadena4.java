package com.arquitecturajava.complementario;

public class PrincipalCadena4 {

	public static void main(String[] args) {

		/*
		 * String cadena="hola";
		 * 
		 * long t1=System.nanoTime(); for (int i=0;i<100_000;i++) {
		 * 
		 * cadena=cadena+"hola"+i; } long t2=System.nanoTime();
		 * 
		 * System.out.println(t2-t1);
		 */

		StringBuffer buffer = new StringBuffer("hola");

		long t1 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {

			buffer.append("hola");
			buffer.append(i);
		}

		long t2 = System.nanoTime();

		System.out.println(t2 - t1);
	}

}
