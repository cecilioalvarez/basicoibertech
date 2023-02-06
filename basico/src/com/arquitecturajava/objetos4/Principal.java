package com.arquitecturajava.objetos4;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
	
		var lista= new ArrayList<String>();
		
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");
		
		for (int i=0;i<lista.size();i++) {
			
			System.out.println(lista.get(i));
		}
		
		// java 5 iteradores patron de diseño 
		
		for (String cadena:lista) {
			
			System.out.println(cadena);
		}
		
		//java 1.
		Iterator<String> iterador= lista.iterator();
		
		while(iterador.hasNext()) {
			
			System.out.println(iterador.next());
		}

	}

}
