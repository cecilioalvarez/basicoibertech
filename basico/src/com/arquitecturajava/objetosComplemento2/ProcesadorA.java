package com.arquitecturajava.objetosComplemento2;

import java.util.ArrayList;
import java.util.List;

public class ProcesadorA extends Procesador {

	
	@Override
	public List<Factura> procesarLineas(List<String> lineas) {
		
		List<Factura> lista = new ArrayList<Factura>();

		for (String linea : lineas) {

			String[] partes = linea.split(",");
			Factura f = new Factura(partes[0], partes[1], Double.parseDouble(partes[2]));
			lista.add(f);

		}
		return lista;
		
		
	}

}
