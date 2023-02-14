package com.arquitecturajava.colecciones4;

import java.util.HashMap;
import java.util.Set;

public class Principal4 {

	public static void main(String[] args) {
		
		//clave valor
		HashMap<String,Persona> mapa= new HashMap<String,Persona>();
		Persona p1= new Persona("1","pepe",20);
		Persona p2= new Persona("2","ana",30);
		Persona p3= new Persona("3","miguel",40);
		
		
		mapa.put(p1.getDni(), p1);
		mapa.put(p2.getDni(), p2);
		mapa.put(p3.getDni(), p3);
		
		Set<String> claves=mapa.keySet();
		
		for (String clave:claves) {
			
			System.out.println(mapa.get(clave).getNombre());
		}
	}

}
