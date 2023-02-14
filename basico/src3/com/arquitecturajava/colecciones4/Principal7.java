package com.arquitecturajava.colecciones4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Principal7 {

	public static void main(String[] args) {
		
		//clave valor
		Map<Persona,HistorialMedico> mapa= new TreeMap<Persona,HistorialMedico>();
		Persona p1= new Persona("1","pepe",20);
		Persona p2= new Persona("2","ana",30);
		Persona p3= new Persona("3","miguel",40);
		
		HistorialMedico hm1= new HistorialMedico(p1.getDni(),"gripe");
		HistorialMedico hm2= new HistorialMedico(p2.getDni(),"covid");
		HistorialMedico hm3= new HistorialMedico(p3.getDni(),"anginas");
		
	
		
		mapa.put(p1, hm1);
		mapa.put(p2, hm2);
		mapa.put(p3, hm3);
		
		
		
	
	
		
		Set<Persona> personas=mapa.keySet();
		
		for (Persona persona:personas) {
			System.out.println(persona.getNombre());
			System.out.println(mapa.get(persona).getDni());
			System.out.println(mapa.get(persona).getEnfermedad());
			
			
		}
	}

}
