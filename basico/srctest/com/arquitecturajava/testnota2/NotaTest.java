package com.arquitecturajava.testnota2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NotaTest {

	@Test
	void nota_esta_aprobada_test() {
		// arrangue

		Nota nota = new Nota(6);
		boolean aprobada = nota.estaAprobada();

		// lo que te interesa es que los valores limites
		Nota nota2 = new Nota(5);
		boolean aprobada2 = nota2.estaAprobada();

		assertTrue(aprobada);
		assertTrue(aprobada2);
	}

	@Test
	void nota_no_esta_aprobada_test() {
		// arrangue
		Nota nota = new Nota(4);
		boolean aprobada = nota.estaAprobada();
		assertFalse(aprobada);

	}

	@Test
	void nota_igualdad_con_nota_por_valor_test() {
		// arrangue

		Nota nota1 = new Nota(4);
		Nota nota2 = new Nota(4);
		Nota nota3 = new Nota(7);

		boolean nota1IgualNota2 = nota1.equals(nota2);

		boolean nota1IgualNota3 = nota1.equals(nota3);

		assertTrue(nota1IgualNota2);
		assertFalse(nota1IgualNota3);

	}

	@Test
	void nota_mayor_que_otra_nota_test() {
		// arrangue

		Nota notaMenor = new Nota(4);
		Nota notaMayor = new Nota(5);

		assertEquals(1, notaMayor.compareTo(notaMenor));
	}

	@Test
	void nota_menor_que_otra_nota_test() {
		// arrangue

		Nota notaMenor = new Nota(4);
		Nota notaMayor = new Nota(5);

		assertEquals(-1, notaMenor.compareTo(notaMayor));
	}

	@Test
	void nota_igual_que_otra_nota_comparable_test() {
		// arrangue

		Nota notaMenor = new Nota(4);
		Nota notaMayor = new Nota(4);

		assertEquals(0, notaMenor.compareTo(notaMayor));
	}

	@Test
	void valor_nota__setting_no_valido_test() {
		// arrange

		Nota notaNoValida = new Nota(4);

		// act
		RuntimeException excepcion = 
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
			notaNoValida.setValor(-3);
		});
		
		RuntimeException excepcion2 = 
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Nota nota= new Nota(11);
		});
		
		
		
		
		//assert
		
		assertEquals("la nota no tiene un valor valido",excepcion.getMessage());
		assertEquals("la nota no tiene un valor valido",excepcion2.getMessage());

	}

}
