package com.arquitecturajava.objetosExcepciones91;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GestorFichero {

	private static final Logger logger = LogManager.getLogger(GestorFichero.class);

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

	// que gestione una excepcion de tipo runtime
	public void crearFichero() {

		File fichero = new File(ruta);
		logger.debug("la variable ruta vale"+ ruta);
		logger.info("entramos en crear fichero");
		logger.warn("la ruta esta vacia");
		// try with resources
		try (GestorCorreo gestor = gestorCorreo;) {
			fichero.createNewFile();
			gestor.enviarCorreo();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error(e);
			throw new GestorException("el gestor no funciona", e);
		}
		logger.warn("el gestor de correo no esta bien");
		logger.info("salimos de crear fichero");

	}

}
