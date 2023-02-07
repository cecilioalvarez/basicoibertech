package com.arquitecturajava.objetos5;

import java.util.ArrayList;

public class Suelo {

	private ArrayList<Baldosa> baldosas = new ArrayList<Baldosa>();

	public void addBaldosa(Baldosa baldosa) {

		baldosas.add(baldosa);

		
	}

	public int numeroBalsosas() {
		return baldosas.size();
	}

	public double precioTotal() {

		double total = 0;
		for (Baldosa baldosa : baldosas) {

			total += baldosa.getPrecio();
		}
		return total;
	}

	public int getBoldosasPorColor(String color) {

		int total = 0;
		for (Baldosa baldosa : baldosas) {

			if (baldosa.getColor().equals(color)) {
				total++;
			}
		}
		return total;

	}

	public String colorMasRepetido() {

		int maximo=0;
		int posicion =0;
		ArrayList<String> colores= new ArrayList<String>();
		ArrayList<Integer> repeticiones= new ArrayList<Integer>();
		
		
		
		for (Baldosa baldosa : baldosas) {

			if (!colores.contains(baldosa.getColor())) {
				colores.add(baldosa.getColor());
				repeticiones.add(1);
			}else {
				
				int indice=colores.indexOf(baldosa.getColor());
				repeticiones.set(indice, repeticiones.get(indice)+1);
			}
		
			
			
		}
		for (int i=0;i<repeticiones.size();i++) {
			
			if(maximo<repeticiones.get(i)) {
				
				maximo=repeticiones.get(i);
				posicion=i;
			}
			
		}
		
		
		return colores.get(posicion);

	}

}
