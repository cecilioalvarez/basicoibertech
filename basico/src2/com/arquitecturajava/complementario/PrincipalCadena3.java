package com.arquitecturajava.complementario;

public class PrincipalCadena3 {

	public static void main(String[] args) {

		String cadena = "hola";

		long memoria = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		System.out.println(memoria);
		//long t1 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {

			cadena = cadena + "hola" + i;
		}
		long t2 = System.nanoTime();

		//System.out.println(t2 - t1);

		long memoria2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println(memoria2);
		
		for (int i=0;i<10;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.gc();
			System.out.println("intento llamar");
		}
		
		
		memoria2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println(memoria2);
	}

}
