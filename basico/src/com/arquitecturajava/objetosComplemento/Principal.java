package com.arquitecturajava.objetosComplemento;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		  Path ruta = Paths.get("tipoA.txt");
		
		 try {
				List<String> lineas = Files.readAllLines(ruta, StandardCharsets.UTF_8);
			
			for (String linea : lineas) {
				
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
