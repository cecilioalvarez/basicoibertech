package com.arquitecturajava.testnota;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class GrupoNotasTest {

	
	@Test
	void añadir_nota_al_grupo_notas_test() {
		
		List<Nota> notas= new ArrayList<Nota>();
		GrupoNotas grupo= new GrupoNotas(notas);
		grupo.add(new Nota(4));
		assertEquals(1, grupo.getNotas().size());
		
		
	}
	
	@Test
	void calcular_nota_media_grupo_notas() {
		
		List<Nota> notas= new ArrayList<Nota>();
		notas.add(new Nota(5.2));
		notas.add(new Nota(4.3));
		notas.add(new Nota(3.2));
		double mediaEsperada=4.23;
		GrupoNotas grupo= new GrupoNotas(notas);
		
		
		double mediaCalculada=grupo.notaMedia();
		
		
		assertEquals(mediaEsperada,mediaCalculada,0.1);
		
		
	}
	
	@Test
	void eliminar_nota_del_grupo_notas() {
		
		List<Nota> notas= new ArrayList<Nota>();
		notas.add(new Nota(4.5));
		notas.add(new Nota(5.2));
		notas.add(new Nota(3.2));
		
		GrupoNotas grupo= new GrupoNotas(notas);
		
		grupo.remove(new Nota(4.5));
		assertEquals(2, grupo.getNotas().size());
		
		
	}
	
	

}
