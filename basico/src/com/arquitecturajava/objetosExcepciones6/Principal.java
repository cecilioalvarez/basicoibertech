package com.arquitecturajava.objetosExcepciones6;

import java.io.IOException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {

		JFrame frame = null;
		JLabel label = null;
		frame = new JFrame("crear fichero");
		frame.setSize(200, 200);
		label = new JLabel("hola desde java");
		frame.getContentPane().add(label);
		frame.setVisible(true);

	}

}
