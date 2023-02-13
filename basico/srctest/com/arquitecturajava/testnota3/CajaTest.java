package com.arquitecturajava.testnota3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

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
	void add_azulejo_caja() {
		
		//arrange
		Caja caja= new Caja(1, new ArrayList<Azulejo>());
		
		//act 
		Azulejo azulejo= new Azulejo(2);
		caja.addAzulejo(azulejo);
		
		//assert
		
		assertTrue(caja.getAzulejos().contains(azulejo));
		
		
		
	}

}
