package com.arquitecturajava.objetosExcepciones91;

public class SuperGestorFichero {

	private GestorFichero gestor;
	
	public SuperGestorFichero (String ruta,  GestorCorreo gestorCorreo ) {
		
		gestor= new GestorFichero(ruta,gestorCorreo);
	}

	public String getRuta() {
		return gestor.getRuta();
	}

	public void setRuta(String ruta) {
		gestor.setRuta(ruta);
	}

	public void crearFichero() {
		gestor.crearFichero();
	}

	
	
	
	
	
}
