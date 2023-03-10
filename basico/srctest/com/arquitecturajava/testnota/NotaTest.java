package com.arquitecturajava.testnota;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotaTest {

	@Test
	void nota_esta_aprobada_test() {
		//arrangue

		Nota nota= new Nota(6);
		boolean aprobada= nota.estaAprobada();
		
		// lo que te interesa es que los valores limites
		Nota nota2= new Nota(5);
		boolean aprobada2= nota2.estaAprobada();
		
		assertTrue(aprobada);
		assertTrue(aprobada2);
	}
	
	
	@Test
	void nota_no_esta_aprobada_test() {
		//arrangue
		Nota nota= new Nota(4);
		boolean aprobada= nota.estaAprobada();
		assertFalse(aprobada);
		
	}
	
	@Test
	void nota_igualdad_con_nota_por_valor_test() {
		//arrangue
		
		Nota nota1= new Nota(4);
		Nota nota2= new Nota(4);
		Nota nota3= new Nota (7);
		
		boolean nota1IgualNota2= nota1.equals(nota2);
		
		boolean nota1IgualNota3= nota1.equals(nota3);
		
		assertTrue(nota1IgualNota2);
		assertFalse(nota1IgualNota3);
		
		
		
		
		
	}
	
	

}
