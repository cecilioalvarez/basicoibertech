package com.arquitecturajava.objetosExcepciones2;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Principal {

	public static void main(String[] args) {

		GestorFichero gestor = new GestorFichero("prueba.txt");

		List<String> lineas = gestor.leerLineas();
		String totalTexto="";
		for (String linea : lineas) {

			totalTexto+=linea;
		}
		
		
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setSize(200, 200);
		JLabel label = new JLabel(totalTexto);
		frame.getContentPane().add(label);
		frame.pack();
		frame.setVisible(true);

	}

}
