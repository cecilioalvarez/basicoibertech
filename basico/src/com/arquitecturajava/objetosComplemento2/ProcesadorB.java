package com.arquitecturajava.objetosComplemento2;

import java.util.ArrayList;
import java.util.List;

public class ProcesadorB extends Procesador {
	
	@Override
	public List<Factura> procesarLineas(List<String> lineas) {
		
		List<Factura> lista = new ArrayList<Factura>();

		for (String linea : lineas) {

			String[] partes = linea.split("\\|");
			Factura f = new Factura(partes[2], partes[1], Double.parseDouble(partes[0]));
			lista.add(f);

		}
		return lista;
		
		
	}

}
