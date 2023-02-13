package com.arquitecturajava.testnota3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AzulejoTest1 {

	
	@Test
	public void azulejo_peso_por_defecto_es_1_test() {
		
		Azulejo azulejo1 = new Azulejo(2);
		
		double pesoInicial= azulejo1.getPeso();
		
		assertEquals(1,pesoInicial);
		
	}
	@Test
	public void azulejo_calcular_area_test() {
		
		Azulejo azulejo1 = new Azulejo(2);
		
		double area= azulejo1.area();
		
		assertEquals(4,area);
		
	}
	@Test
	public void azulejo_calcular_perimetro_test() {
		
		Azulejo azulejo1 = new Azulejo(2);
		
		double perimetro= azulejo1.perimetro();
		
		assertEquals(8,perimetro);
		
	}

}
