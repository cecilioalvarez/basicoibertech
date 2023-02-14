package com.arquitecturajava.colecciones4;

import java.util.Comparator;

public class PersonaNombreComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
