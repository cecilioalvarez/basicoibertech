package com.arquitecturajava.collecciones1;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal2 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");

		Iterable<String> iterable = lista;

		// simplificacion de la sintaxis
		for (String cadena : iterable) {

			System.out.println(cadena);
		}

		// esta
		Iterator<String> it = iterable.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		Iterator<String> it2 = iterable.iterator();

		while (it2.hasNext()) {

			if (it2.next().equals("hola")) {
				it2.remove();
			}
		}
		
		System.out.println("********");
		for (String cadena : iterable) {

			System.out.println(cadena);
		}
		
		
		for (String cadena : lista) {

			
			if (cadena.equals("hola")) {
				lista.remove(cadena);
			}
			
			System.out.println(cadena);
			
		}
	}

}
