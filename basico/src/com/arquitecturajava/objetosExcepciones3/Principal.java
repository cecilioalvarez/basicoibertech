package com.arquitecturajava.objetosExcepciones3;

import java.io.IOException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Principal {

	public static void main(String[] args) {

		GestorFichero gestor = new GestorFichero("prueba.txt");
		
		String totalTexto="";
		List<String> lineas;
		JFrame frame=null;
		JLabel label=null;
		try {
			frame = new JFrame("HelloWorldSwing");
			frame.setSize(200, 200);
			
			// petar
			lineas = gestor.leerLineas();
			for (String linea : lineas) {
				
				totalTexto+=linea;
			}
			
			label = new JLabel(totalTexto);
			frame.getContentPane().add(label);
			frame.setVisible(true);
			
			
			
		} catch (IOException e) {
			
			label = new JLabel(e.toString());
			frame.getContentPane().add(label);
			frame.setVisible(true);
		}

		
		
		
	

	}

}
