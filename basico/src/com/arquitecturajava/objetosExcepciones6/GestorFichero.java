package com.arquitecturajava.objetosExcepciones6;

import java.io.File;
import java.io.IOException;

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

	public void crearFichero() throws IOException {

		File fichero = new File(ruta);

		try {
			fichero.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IOException("el gestor no funciona",e);
		}

	}

}
