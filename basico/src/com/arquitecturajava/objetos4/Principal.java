package com.arquitecturajava.objetos4;

import java.util.ArrayList;

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
		
		for (String cadena:lista) {
			
			System.out.println(cadena);
		}

	}

}
