package com.arquitecturajava.objetosComplemento7;

import java.util.ArrayList;
import java.util.List;

public class Habitacion implements Encendible {

	private List<Encendible> bombillas = new ArrayList<Encendible>();

	
	public List<Encendible> getBombillas() {
		return bombillas;
	}

	public void setBombillas(List<Encendible> bombillas) {
		this.bombillas = bombillas;
	}

	@Override
	public void on() {

		for (Encendible encendible : bombillas) {

			encendible.on();
		}

	}

	public boolean add(Encendible e) {
		return bombillas.add(e);
	}

	@Override
	public void off() {
		for (Encendible encendible : bombillas) {
			encendible.off();
		}

	}

	@Override
	public boolean isEncendida() {
		// TODO Auto-generated method stub
		return false;
	}

}
