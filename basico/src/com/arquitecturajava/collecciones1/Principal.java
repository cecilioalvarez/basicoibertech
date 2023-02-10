package com.arquitecturajava.collecciones1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		ArrayList<String> lista= new ArrayList<String>();
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");
		
		for (int i=0;i<lista.size();i++) {
			
			System.out.println(lista.get(i));
		}
		
		lista.clear();
		System.out.println(lista.isEmpty());
		System.out.println(lista.contains("tal"));
		
		
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");
		
		System.out.println(lista.contains("estas"));

	}

}
