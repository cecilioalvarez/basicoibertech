package com.arquitecturajava.colecciones4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal6 {

	public static void main(String[] args) {
		
		//clave valor
		Map<String,Persona> mapa= new HashMap<String,Persona>();
		Persona p1= new Persona("1","pepe",20);
		Persona p2= new Persona("2","ana",30);
		Persona p3= new Persona("3","miguel",40);
		
		Persona p4= new Persona("4","antonio",20);
		Persona p5= new Persona("5","david",30);
		Persona p6= new Persona("6","sandra",40);
		Persona p7= new Persona("7","gema",20);
		Persona p8= new Persona("8","pepito",30);
		Persona p9= new Persona("9","jose",40);
		
		mapa.put(p4.getDni(), p4);
		mapa.put(p5.getDni(), p5);
		mapa.put(p6.getDni(), p6);
		
		mapa.put(p7.getDni(), p7);
		mapa.put(p8.getDni(), p8);
		mapa.put(p9.getDni(), p9);
		
		mapa.put(p2.getDni(), p2);
		mapa.put(p3.getDni(), p3);
		mapa.put(p1.getDni(), p1);
		
	
	
		
		Set<String> claves=mapa.keySet();
		
		for (String clave:claves) {
			
			System.out.println(mapa.get(clave).getDni());
			System.out.println(mapa.get(clave).getNombre());
			
		}
	}

}
