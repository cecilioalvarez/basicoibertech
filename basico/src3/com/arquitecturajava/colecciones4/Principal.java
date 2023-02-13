package com.arquitecturajava.colecciones4;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		
		Set<String> conjunto= new HashSet<String>();
		conjunto.add("pedro");
		conjunto.add("pedro");
		conjunto.add("juan");
		conjunto.add("maria");
		conjunto.add("gema");
		
		
		for (String nombre:conjunto) {
			System.out.println(nombre);
		}

	}

}
