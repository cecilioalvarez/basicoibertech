package com.arquitecturajava.objetosExcepciones91;

public class GestorCorreo implements AutoCloseable {

	public void enviarCorreo() {
		
		System.out.println("enviando un correo");

	}
	public void close() {
		
		//System.out.println("cerrando la conexion smtp");
	}
}
