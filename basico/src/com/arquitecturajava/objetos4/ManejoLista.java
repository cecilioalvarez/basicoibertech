package com.arquitecturajava.objetos4;

import java.util.ArrayList;

public class ManejoLista {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista= new ArrayList<String>();
		
		lista.add("hola");
		System.out.println(lista.size());
		System.out.println(lista.isEmpty());
		lista.remove(0);
		System.out.println(lista.isEmpty());
		
		
	}

}
