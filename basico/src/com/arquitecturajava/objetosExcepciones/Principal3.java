package com.arquitecturajava.objetosExcepciones;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Principal3 {

	public static void main(String[] args) {
		
		
	
		try {
			List<String> lineas = Files.readAllLines(Paths.get("prueba1.txt"), StandardCharsets.UTF_8);
			for (String linea : lineas) {
				
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			// hemos impreso la excepcion como tal
			System.out.println(e);
			throw new RuntimeException("todo peto");
			
		}finally {
			// se ejecuta siempre falle o no el programa
			System.out.println("cerrando recursos");
		}
		
		System.out.println("el programa finaliza");

	}

}
