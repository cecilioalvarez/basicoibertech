package com.arquitecturajava.objetosComplemento7;

public class Principal {

	public static void main(String[] args) {

		Habitacion h = new Habitacion();
		Bombilla b1 = new Bombilla(true);
		Bombilla b2 = new Bombilla(true);
		Bombilla b3 = new Bombilla(true);
		h.add(b1);
		h.add(b2);
		h.add(b3);
		Piso p = new Piso();
		p.add(h);

		p.on();

		for (Habitacion habitacion : p.getHabitaciones()) {

			for (Encendible b : habitacion.getBombillas()) {

				System.out.println(b.isEncendida());

			}
		}

		p.off();

		// p.off();

		for (Habitacion habitacion : p.getHabitaciones()) {

			for (Encendible b : habitacion.getBombillas()) {

				System.out.println(b.isEncendida());

			}
		}

	}

}
