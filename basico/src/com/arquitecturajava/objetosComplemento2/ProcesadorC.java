package com.arquitecturajava.objetosComplemento2;

import java.util.ArrayList;
import java.util.List;

public class ProcesadorC extends Procesador {

	@Override
	public List<Factura> procesarLineas(List<String> lineas) {

		int contador = 0;
		List<Factura> lista = new ArrayList<Factura>();
		Factura f = new Factura();

		f.setImporte(Double.parseDouble(lineas.get(0)));
		f.setConcepto(lineas.get(1));
		f.setNumero(lineas.get(2));

		Factura f2 = new Factura();

		f2.setImporte(Double.parseDouble(lineas.get(4)));
		f2.setConcepto(lineas.get(5));
		f2.setNumero(lineas.get(6));
		lista.add(f2);
		return lista;
	}

}
