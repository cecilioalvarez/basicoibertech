package com.arquitecturajava.objetosComplemento3;

import java.util.ArrayList;

public class Gimnasio {
	
	private ArrayList<Socio> socios= new ArrayList<Socio>();

	
	public void addSocio(Socio s) {
		
		socios.add(s);
	}
	
	public double ingresosTotales() {
		
		double total=0;
		for (Socio s: socios) {
			total+=s.cuotaMensual();
		}
		return total;
	}
}
