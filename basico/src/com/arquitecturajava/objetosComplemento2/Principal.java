package com.arquitecturajava.objetosComplemento2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		String fichero="tipoB.txt";
	
		try {
			List<String> lineas = leerLineas(fichero);
			Procesador procesador= new FactoriaProcesador().getProcesador(fichero.substring(0,5));
			List<Factura> lista = procesador.procesarLineas(lineas);
			imprimirFacturas(lista);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	private static List<String> leerLineas(String fichero) throws IOException {
		Path ruta = Paths.get(fichero);

		List<String> lineas = Files.readAllLines(ruta, StandardCharsets.UTF_8);
		return lineas;
	}

	private static void imprimirFacturas(List<Factura> lista) {
		for (Factura f : lista) {

			System.out.println(f.getNumero());
			System.out.println(f.getConcepto());
			System.out.println(f.getImporte());
		}
	}

}
