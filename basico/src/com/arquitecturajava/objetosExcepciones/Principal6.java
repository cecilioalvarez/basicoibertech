package com.arquitecturajava.objetosExcepciones;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal6 {

	public static void main(String[] args) {

		String linea = "";
		// bloque try with resources

		try (FileInputStream fi = new FileInputStream("prueba1.txt");
				InputStreamReader intstream = new InputStreamReader(fi);
				BufferedReader buffer = new BufferedReader(intstream);) {

			while (linea != null) {

				linea = buffer.readLine();
				System.out.println(linea);
			}
		} catch (IOException e) {

			System.out.println("hay un error de java io" + e);
		}

	}

}
