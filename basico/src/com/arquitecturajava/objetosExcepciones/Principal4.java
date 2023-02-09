package com.arquitecturajava.objetosExcepciones;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal4 {

	public static void main(String[] args) {

		String linea = "";

		try {
			InputStreamReader instream = new InputStreamReader(new FileInputStream("prueba.txt"));
			BufferedReader buffer = new BufferedReader(instream);

			while (linea != null) {

				linea = buffer.readLine();
				System.out.println(linea);
			}
		} catch (FileNotFoundException e) {

			System.out.println("no hemos encontrado el fichero"+e);
			
		} catch (IOException e) {
			
			System.out.println("hay un error de entrada de datos"+e);
		}

	}

}
