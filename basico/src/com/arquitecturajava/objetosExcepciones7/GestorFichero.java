package com.arquitecturajava.objetosExcepciones7;

import java.io.File;
import java.io.IOException;

public class GestorFichero {

	private String ruta;
	private GestorCorreo gestorCorreo;

	public GestorFichero(String ruta) {
		super();
		this.ruta = ruta;
	}

	public GestorFichero(String ruta, GestorCorreo gestorCorreo) {
		super();
		this.ruta = ruta;
		this.gestorCorreo = gestorCorreo;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public void crearFichero() throws IOException {

		File fichero = new File(ruta);

	    //try with resources
		try (GestorCorreo gestor= new GestorCorreo()){
			fichero.createNewFile();
			gestor.enviarCorreo();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IOException("el gestor no funciona",e);
		}

	}

}
