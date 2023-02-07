package com.arquitecturajava.objetosComplemento2;

import java.util.List;

public abstract class Procesador {

	public abstract List<Factura> procesarLineas(List<String> lineas);

	public static Procesador getInstancia(String tipo) {

		if (tipo.equals("tipoA")) {

			return new ProcesadorA();
		} else if (tipo.equals("tipoB")) {

			return new ProcesadorB();
		}else return new ProcesadorC();
	}

}
