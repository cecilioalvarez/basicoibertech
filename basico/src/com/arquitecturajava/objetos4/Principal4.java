package com.arquitecturajava.objetos4;

import java.util.Collections;
import java.util.List;

public class Principal4 {

	public static void main(String[] args) {
	
		
		Libro l= new Libro("java",new Autor("pedro",30));
		
		
		l.addCapitulo(new Capitulo ("java3",20));
		l.addCapitulo(new Capitulo ("java2",20));
		l.addCapitulo(new Capitulo ("java1",40));
		l.addCapitulo(new Capitulo ("intro",15));

		Collections.sort(l.getCapitulos());
		for (Capitulo c: l.getCapitulos()) {
			
			System.out.println(c.getTitulo());
		}
		System.out.println("************");
		System.out.println(l.capituloMasLargo().getPaginas());
	}
	

}
