package com.arquitecturajava.objetosExcepciones3;

import java.io.IOException;
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

	public List<String> leerLineas() throws IOException {

		List<String> lineas = new ArrayList<String>();

		lineas = Files.readAllLines(Paths.get(ruta), StandardCharsets.UTF_8);

		return lineas;
	}

}
