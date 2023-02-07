package com.arquitecturajava.objetosComplemento;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		  Path ruta = Paths.get("tipoA.txt");
		
		 try {
				List<String> lineas = Files.readAllLines(ruta, StandardCharsets.UTF_8);
			
			List<Factura> lista= new ArrayList<Factura>();	
				
			for (String linea : lineas) {
				
				String[] partes= linea.split(",");
				System.out.println(partes[0]);
				System.out.println(partes[1]);
				System.out.println(partes[2]);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
