package com.arquitecturajava.jdbcpatrones5;

import java.sql.SQLException;
import java.util.List;



public class PrincipalPatron1 {

	public static void main(String[] args) {

		//insertarPersona( new PersonaActiveRecord ("paquito","sanchez",10));

		//borrarPersona(new PersonaActiveRecord("paquito"));
		PersonaRepository repoPersona= new PersonaRepositoryJDBC();
		
		List<Persona> lista=repoPersona.buscarTodos("edad","asc");
		
		
		for (Persona p:lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}
		 
		
		//PersonaActiveRecord p1= new PersonaActiveRecord("maria");
		//p1.borrar();
		
		/*
		try {
			PersonaActiveRecord p=PersonaActiveRecord.buscarUno("pepe");
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
			System.out.println(p.getEdad());
		} catch (Exception e) {
			System.out.println("main");
			e.printStackTrace();
			System.out.println("main");
		}*/
		
	}

	
	
	

}
