package com.arquitecturajava.testcolecciones;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class ColeccionesTest {

	@Test
	void lista_add_elementos_test() {
		//AAA
		// Arrange preparar los datos de la prueda
		//A Act actuar en la cual se prueba la funcionalidad
		// Assert es la confiramcion
		
		//Arrange
		ArrayList<String> lista= new ArrayList<String>();
		
		lista.add("hola");
		lista.add("adios");
		// Assert 
		assertEquals(2,lista.size());
		
	}
	
	@Test
	void lista_remove_elemento_test() {
		//AAA
		// Arrange preparar los datos de la prueda
		//A Act actuar en la cual se prueba la funcionalidad
		// Assert es la confiramcion
		
		//Arrange
		ArrayList<String> lista= new ArrayList<String>();
		
		lista.add("hola");
		lista.add("adios");
		
		lista.remove(1);
		// Assert 
		assertEquals(1,lista.size());
		
	}
	
	@Test
	void lista_remove_elemento_test_con_stream() {
		//AAA
		// Arrange preparar los datos de la prueda
		//A Act actuar en la cual se prueba la funcionalidad
		// Assert es la confiramcion
		
		//Arrange
		
		List<String> lista=Stream.of("hola","que").collect(Collectors.toList());
		//act 
		lista.remove(1);
		// Assert 
		assertEquals(1,lista.size());
		
	}
	

}
