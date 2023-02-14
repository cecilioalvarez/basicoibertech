package com.arquitecturajava.colecciones4;

import java.util.Comparator;

public class ExamenNombreComprator implements Comparator<Examen> {

	@Override
	public int compare(Examen o1, Examen o2) {
		
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
