package com.arquitecturajava.colecciones4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal8 {

	public static void main(String[] args) {
		
		Niño n1= new Niño("juan");
		Niño n2= new Niño("ana");
		Niño n3= new Niño("david");
		
		List<Niño> lista1= List.of(n1,n2,n3);
		
		Niño n4= new Niño("blanca");
		Niño n5= new Niño("gema");
		Niño n6= new Niño("luz");

		List<Niño> lista2= List.of(n4,n5,n6);
		
		Map<Tutor,List<Niño>> mapa = new HashMap<Tutor,List<Niño>>();
		
		mapa.put(new Tutor("tutor1"), lista1);
		mapa.put(new Tutor("tutor2"), lista2);
		
		
		Set<Tutor> tutores=mapa.keySet();
		
		for (Tutor t: tutores) {
			
			for (Niño n: mapa.get(t)) {
				
				System.out.println(n.getNombre());
			}
		}
		
	}

}
