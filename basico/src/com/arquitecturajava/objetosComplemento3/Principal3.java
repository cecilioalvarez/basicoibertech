package com.arquitecturajava.objetosComplemento3;

import java.util.Arrays;
import java.util.List;

public class Principal3 {

	public static void main(String[] args) {
		
		List<String> lista=Arrays.asList("hola","que","tal");
		
		// expresion lambda en un stream
		
		lista.forEach(Principal3::imprimir);
		
		

	}
	public static void imprimir(String cadena) {
		
		System.out.println("***");
		System.out.println(cadena);
		System.out.println("***");
		
	}

}
