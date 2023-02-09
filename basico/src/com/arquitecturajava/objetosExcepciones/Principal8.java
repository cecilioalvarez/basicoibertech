package com.arquitecturajava.objetosExcepciones;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal8 {

	public static void main(String[] args) {

		String linea = "";
		// bloque try with resources

		try (FileInputStream fi = new FileInputStream("prueba.txt");
				InputStreamReader intstream = new InputStreamReader(fi);
				BufferedReader buffer = new BufferedReader(intstream);) {

			while ((linea = buffer.readLine())!=null) {
				System.out.println(linea);
			}
			Class.forName("java.util.ArrayList");
			
		} catch (IOException | ClassNotFoundException e) {

			System.out.println("hay un error de java " + e);
		}
		System.out.println("el programa finaliza");

	}

}
