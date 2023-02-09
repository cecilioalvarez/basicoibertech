package com.arquitecturajava.objetosExcepciones;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal5a {

	public static void main(String[] args) {

		String linea = "";
		InputStreamReader instream = null;
		BufferedReader buffer = null;

		try {
			instream = new InputStreamReader(new FileInputStream("prueba.txt"));
			buffer = new BufferedReader(instream);

			while (linea != null) {

				linea = buffer.readLine();
				System.out.println(linea);
			}
		} catch (IOException e) {

			System.out.println("hay un error de java io" + e);
		} finally {

			if (buffer != null) {

				try {
					buffer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (instream != null) {

				try {
					instream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

}
