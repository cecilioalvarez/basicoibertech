package com.arquitecturajava.testcolecciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ColeccionesTest {

	@Test
	@DisplayName("Añadir nuevo elemento a la lista con Strings")
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
	@DisplayName("Eliminar elemento de la lista de String")
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
	@DisplayName("Eliminar elemento de la lista otra opcion")
	void lista_remove_elemento_test_con_stream_test() {
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
	
	@Test
	@DisplayName("contiene elemento en la lista")
	void lista_contiene_elemento_test() {
		//AAA
		// Arrange preparar los datos de la prueda
		//A Act actuar en la cual se prueba la funcionalidad
		// Assert es la confiramcion
		
		//Arrange
		
		List<String> lista=List.of("hola","que","tal");
		boolean verdadero= lista.contains("hola");
		boolean falso= lista.contains("pepe");
		
		assertTrue(verdadero);
		assertFalse(falso);
	}
	
	
	@Test
	@DisplayName("añade una lista a otra")
	void lista_añade_otra_lista_test() {
	
		
		List<String> lista=new ArrayList<String>();
		List<String> lista2=List.of("yo","estoy","bien");
		lista.addAll(lista2);
		assertEquals(3,lista.size());
		
	}
	
	@Test
	@DisplayName("accede a un elemnto por posicion")
	void lista_obtener_posicion_elemento() {
	
		
		
		List<String> lista=List.of("hola","que","tal");
		assertEquals("hola",lista.get(0));
		
	}
	
	
	

}
