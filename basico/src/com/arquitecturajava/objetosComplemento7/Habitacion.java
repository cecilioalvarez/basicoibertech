package com.arquitecturajava.objetosComplemento7;

import java.util.ArrayList;
import java.util.List;

public class Habitacion implements Encendible {

	private List<Encendible> encendibles = new ArrayList<Encendible>();

	public List<Encendible> getBombillas() {
		return encendibles;
	}

	public void setBombillas(List<Encendible> bombillas) {
		this.encendibles = bombillas;
	}

	@Override
	public void on() {

		for (Encendible encendible : encendibles) {

			encendible.on();
		}

	}

	public boolean add(Encendible e) {
		return encendibles.add(e);
	}

	@Override
	public void off() {
		for (Encendible encendible : encendibles) {
			encendible.off();
		}

	}

	@Override
	public boolean isEncendida() {

		for (Encendible encendible : encendibles) {
			if (!encendible.isEncendida())
				return false;

		}
		return true;
	}

}
