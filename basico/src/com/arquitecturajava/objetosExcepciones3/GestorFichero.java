package com.arquitecturajava.objetosExcepciones3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GestorFichero {

	private String ruta;

	public GestorFichero(String ruta) {
		super();
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	// dejamos a la excepcion fluir
	public List<String> leerLineas() throws IOException {

		List<String> lineas = new ArrayList<String>();
		String linea = null;
		
		
		FileInputStream fi = new FileInputStream(ruta);
		InputStreamReader intstream = new InputStreamReader(fi);
		BufferedReader buffer = new BufferedReader(intstream);

		while ((linea = buffer.readLine()) != null) {
			lineas.add(linea);
		}

		return lineas;
	}

}
