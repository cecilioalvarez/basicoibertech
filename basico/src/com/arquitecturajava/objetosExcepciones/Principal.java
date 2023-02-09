package com.arquitecturajava.objetosExcepciones;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		
	
		try {
			List<String> lineas = Files.readAllLines(Paths.get("prueba.txt"), StandardCharsets.UTF_8);
			for (String linea : lineas) {
				
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
