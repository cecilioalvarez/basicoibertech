package com.arquitecturajava.objetos4;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal2 {

	public static void main(String[] args) {
	
		Libro libro= new Libro("java", new Autor("pedro",20));
		
		
		System.out.println(libro.getNombre());

	}

}
