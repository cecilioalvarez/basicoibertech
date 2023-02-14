package com.arquitecturajava.colecciones4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Principal5 {

	public static void main(String[] args) {
		
		//clave valor
		Map<String,Persona> mapa= new HashMap<String,Persona>();
		Persona p1= new Persona("1","pepe",20);
		Persona p2= new Persona("2","ana",30);
		Persona p3= new Persona("3","miguel",40);
		
		mapa.put(p2.getDni(), p2);
		mapa.put(p3.getDni(), p3);
		
		mapa.put(p1.getDni(), p1);
		
		
		Collection<Persona> coleccion=mapa.values();
		
		for (Persona p: coleccion) {
			
			System.out.println(p.getNombre());
		}
	}

}
