package com.arquitecturajava.testnota3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CajaTest {

	@Test
	void calcular_pesoTotal_caja_con_azulejos() {

		// arrange
		Caja c = new Caja(1, crearListaAzulejos(2, 3));
		// act
		double totalPeso = c.calcularPesoTotal();
		// assert
		assertEquals(3, totalPeso);
	}

	@Test
	void inializacion_tamaño_caja_azulejos_por_defecto_es_10_items_test() {

		// arrange
		final int topeCajaEsperadoEs10 = 10;

		Caja c = new Caja(1, Collections.<Azulejo>emptyList());
		// act
		int numeroAzulejosInicialesTope = c.getTope();
		// assert
		assertEquals(topeCajaEsperadoEs10, numeroAzulejosInicialesTope);
	}

	@Test
	void lanza_excepcion_al_añadir_azulejo_a_la_caja_llena_test() {
		
		final int tope = 2;
		
		Caja caja = new Caja(1, crearListaAzulejos(2, 3), tope);

		RuntimeException excepcion = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			caja.addAzulejo(new Azulejo(4));
		});
	}

	@Test
	void lanza_excepcion_al_añadir_azulejos_por_defecto_al_tope_10_test() {

		Caja caja = new Caja(1, crearListaAzulejos(2, 2, 2, 2, 2, 2, 2, 2, 2, 2));

		RuntimeException excepcion = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			caja.addAzulejo(new Azulejo(4));
		});
	}

	@Test
	void add_azulejo_caja() {

		// arrange
		Caja caja = new Caja(1, new ArrayList<Azulejo>());
		Azulejo nuevoAzulejo = new Azulejo(2);

		// act
		caja.addAzulejo(nuevoAzulejo);

		// assert

		assertTrue(caja.getAzulejos().contains(nuevoAzulejo));
	}

	@Test
	void remove_azulejo_caja() {

		// arrange
		List<Azulejo> listaAzulejos = new ArrayList<Azulejo>();
		Azulejo azulejoEliminar = new Azulejo(3);
		listaAzulejos.add(azulejoEliminar);
		Caja caja = new Caja(1, listaAzulejos);

		// act
		boolean estabaContenido = caja.getAzulejos().contains(azulejoEliminar);
		caja.removeAzulejo(azulejoEliminar);

		// assert
		assertTrue(estabaContenido);
		assertFalse(caja.getAzulejos().contains(azulejoEliminar));

	}

	@Test
	void add_azulejo_caja2() {

		// arrange
		Caja caja = new Caja(1, new ArrayList<Azulejo>());

		// act
		caja.addAzulejo(new Azulejo(2));

		// assert
		assertTrue(caja.getAzulejos().contains(new Azulejo(2)));

	}

	// var args argumentos variables
	private static List<Azulejo> crearListaAzulejos(int... lados) {

		List<Azulejo> azulejos = new ArrayList<Azulejo>();

		for (int lado : lados) {

			azulejos.add(new Azulejo(lado));
		}

		return azulejos;
	}
}