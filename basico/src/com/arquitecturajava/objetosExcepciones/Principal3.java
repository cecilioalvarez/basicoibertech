package com.arquitecturajava.objetosExcepciones;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Principal3 {

	public static void main(String[] args) {
		
		
		File fichero= new File("prueba.txt");
		try {
			List<String> lineas = Files.readAllLines(Paths.get("prueba.txt"), StandardCharsets.UTF_8);
			for (String linea : lineas) {
				
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			// hemos impreso la excepcion como tal
			System.out.println(e);
			
		}finally {
			// se ejecuta siempre falle o no el programa
			System.out.println("cerrando recursos");
		}

	}

}
