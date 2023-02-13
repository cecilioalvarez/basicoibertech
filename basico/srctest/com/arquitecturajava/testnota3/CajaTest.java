package com.arquitecturajava.testnota3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.testnota2.Nota;

class CajaTest {

	@Test
	void calcular_pesoTotal() {
		
		//arrange
		Caja c= new Caja(1, List.of(new Azulejo(2), new Azulejo(3)));
		
		//act
		double totalPeso=c.calcularPesoTotal();
		
		//assert
		assertEquals(3,totalPeso);
	}
	
	
	@Test
	void inializacion_tamaño_azulejos_10_test() {
		
		//arrange
		Caja c= new Caja(1, List.of(new Azulejo(2), new Azulejo(3)));
		
		//act
		int numeroAzulejosIniciales=c.getTope();
		
		//assert
		assertEquals(10,numeroAzulejosIniciales);
	}
	
	@Test
	void lanza_excepcion_al_añadir_azulejo_test() {
		
		//arrange
		List<Azulejo> azulejos= new ArrayList<Azulejo>();
		azulejos.add(new Azulejo(2));
		azulejos.add(new Azulejo(3));
		
		Caja caja= new Caja(1, azulejos,2);
		
		RuntimeException excepcion = 
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
				caja.addAzulejo(new Azulejo(4));
		});
	}
	
	
	
	@Test
	void lanza_excepcion_al_añadir_azulejos_por_defecto_al_tope_10_test() {
		
		//arrange
		List<Azulejo> azulejos= new ArrayList<Azulejo>();
		addAzulejo(azulejos,2);
		addAzulejo(azulejos,2);
		addAzulejo(azulejos,2);
		addAzulejo(azulejos,2);
		addAzulejo(azulejos,2);
		addAzulejo(azulejos,2);
		addAzulejo(azulejos,2);
		addAzulejo(azulejos,2);
		addAzulejo(azulejos,2);
		
		
		
		Caja caja= new Caja(1, azulejos);
		
		RuntimeException excepcion = 
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
				caja.addAzulejo(new Azulejo(4));
		});
	}

	
	@Test
	void add_azulejo_caja() {
		
		//arrange
		Caja caja= new Caja(1, new ArrayList<Azulejo>());
		Azulejo nuevoAzulejo= new Azulejo(2);
		
		//act 
		caja.addAzulejo(nuevoAzulejo);
	
		//assert
		
		assertTrue(caja.getAzulejos().contains(nuevoAzulejo));
		
		
		
	}
	
	
	@Test
	void remove_azulejo_caja() {
		
		//arrange
		List<Azulejo> listaAzulejos= new ArrayList<Azulejo>();
		Azulejo azulejoEliminar= new Azulejo(3);
		listaAzulejos.add(azulejoEliminar);
		Caja caja= new Caja(1, listaAzulejos);
		
		//act
		boolean estabaContenido=caja.getAzulejos().contains(azulejoEliminar);
		caja.removeAzulejo(azulejoEliminar);
	
		//assert
		assertTrue(estabaContenido);
		assertFalse(caja.getAzulejos().contains(azulejoEliminar));
		
		
		
	}
	
	@Test
	void add_azulejo_caja2() {
		
		//arrange
		Caja caja= new Caja(1, new ArrayList<Azulejo>());
		
		//act
		caja.addAzulejo(new Azulejo(2));
		
		//assert
		
		assertTrue(caja.getAzulejos().contains(new Azulejo(2)));
		
	}
	
	private  static void addAzulejo(List<Azulejo> lista, double lado) {
		
		lista.add(new Azulejo(lado));
	}
	

}
