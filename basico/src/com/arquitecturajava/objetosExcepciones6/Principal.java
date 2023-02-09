package com.arquitecturajava.objetosExcepciones6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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

			}

		});

		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

	}

}
