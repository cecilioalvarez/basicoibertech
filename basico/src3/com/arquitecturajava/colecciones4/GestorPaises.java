package com.arquitecturajava.colecciones4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorPaises {

	private Map<Pais, List<Ciudad>> paisesCiudades = new HashMap<Pais, List<Ciudad>>();

	public void addCiudadAPais(Pais pais, Ciudad ciudad) {

		if (paisesCiudades.containsKey(pais)) {

			paisesCiudades.get(pais).add(ciudad);
		} else {

			List<Ciudad> ciudades = new ArrayList<Ciudad>();
			ciudades.add(ciudad);
			paisesCiudades.put(pais, ciudades);
		}

	}
	
	public List<Ciudad> getCiudadesDePais(Pais p) {
		
		return paisesCiudades.get(p);
	}
	
	
	public Ciudad getCiudadMasHabitantes(Pais p) {
		
		
		List<Ciudad> ciudades =paisesCiudades.get(p);
		
		Ciudad inicial= ciudades.get(0);
		for (Ciudad ciudad: ciudades) {
		
			if (inicial.getHabitantes()<ciudad.getHabitantes()) {
				
				inicial=ciudad;
			}
		}
		return inicial;
	}

}
