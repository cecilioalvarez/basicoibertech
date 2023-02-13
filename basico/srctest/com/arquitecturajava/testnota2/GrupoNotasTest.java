package com.arquitecturajava.testnota2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrupoNotasTest {

	// FIRST (Fast ,Independiente,Repetible, Chequeo propio, Atemporal)
	
	
	List<Nota> notasBasicasTest=null;
	
	@BeforeEach
	void setUp() {
		
		
		notasBasicasTest= new ArrayList<Nota>();
		notasBasicasTest.add(new Nota(5.2));
		notasBasicasTest.add(new Nota(4.3));
		notasBasicasTest.add(new Nota(3.2));
		notasBasicasTest.add(new Nota(4.2));
		notasBasicasTest.add(new Nota(3.2));
		notasBasicasTest.add(new Nota(4.2));
		
		
		
	}
	
	@Test
	void añadir_nota_al_grupo_notas_test() {
		
		
		GrupoNotas grupo= new GrupoNotas(notasBasicasTest);
		grupo.add(new Nota(4));
		assertTrue(grupo.getNotas().contains(new Nota(4)));
		
		
	}
	
	@Test
	void calcular_nota_media_grupo_notas() {

		///self-checking
		
		double mediaEsperada=4.23;
		List<Nota> notas= new ArrayList<Nota>();
		notas.add(new Nota(5.2));
		notas.add(new Nota(4.3));
		notas.add(new Nota(3.2));
		
		GrupoNotas grupo= new GrupoNotas(notas);
		double mediaCalculada=grupo.notaMedia();
		
		
		assertEquals(mediaEsperada,mediaCalculada,0.1);
		
		
	}
	
	@Test
	void eliminar_nota_del_grupo_notas() {
		
		notasBasicasTest.add(new Nota(7.2));
		GrupoNotas grupo= new GrupoNotas(notasBasicasTest);
		
		//act
		boolean contieneNuevaNota=grupo.getNotas().contains(new Nota(7.2));
		grupo.remove(new Nota(7.2));
		boolean todavidaContieneNuevaNota=grupo.getNotas().contains(new Nota(7.2));
		
		assertTrue(contieneNuevaNota);
		assertFalse(todavidaContieneNuevaNota);
		
		
	}
	
	
	@Test
	void obtener_nota_mayor_test() {
		
		
		//arrange
	
		
		List<Nota> notasAEvaluar=List.of(new Nota(3),new Nota(6),new Nota(9.2));		
		GrupoNotas grupoNotas= new GrupoNotas(notasAEvaluar);
		
		//act 
		Nota notaMayor=grupoNotas.notaMayor();
		
		//assert
		assertEquals(new Nota(9.2),notaMayor);
		
	}
	
	

}
