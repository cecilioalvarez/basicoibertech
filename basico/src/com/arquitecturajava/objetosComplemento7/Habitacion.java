package com.arquitecturajava.objetosComplemento7;

import java.util.ArrayList;
import java.util.List;

public class Habitacion implements Encendible {

	private List<Encendible> lista = new ArrayList<Encendible>();

	@Override
	public void on() {

		for (Encendible encendible : lista) {

			encendible.on();
		}

	}

	public boolean add(Encendible e) {
		return lista.add(e);
	}

	@Override
	public void off() {
		for (Encendible encendible : lista) {
			encendible.off();
		}

	}

}
