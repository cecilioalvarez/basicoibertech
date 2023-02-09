package com.arquitecturajava.objetosExcepciones6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		JFrame frame = null;
		JLabel label = null;
		frame = new JFrame("crear fichero");
		frame.setSize(200, 200);
		JButton button = new JButton("Click Me!");
		frame.getContentPane().add(button);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				GestorFichero gestor= new GestorFichero("h:/pruebafinal.txt");
				try {
					gestor.crearFichero();
					JOptionPane.showMessageDialog(null,
						    "Fichero Insertado",
						    "Fichero ",2);
					
				} catch (IOException e1) {
					
					JOptionPane.showMessageDialog(null,
						    e1.toString(),
						    "Fichero ",2);
				}
				
				
			}

		});

		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

	}

}
