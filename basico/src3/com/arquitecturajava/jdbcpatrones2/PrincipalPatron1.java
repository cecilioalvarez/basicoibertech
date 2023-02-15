package com.arquitecturajava.jdbcpatrones2;

import java.sql.SQLException;
import java.util.List;



public class PrincipalPatron1 {

	public static void main(String[] args) {

		//insertarPersona( new PersonaActiveRecord ("paquito","sanchez",10));

		//borrarPersona(new PersonaActiveRecord("paquito"));
		
		/*
		List<PersonaActiveRecord> lista=PersonaActiveRecord.buscarTodos();
		
		for (PersonaActiveRecord p:lista) {
			
			System.out.println(p.getNombre());
		}*/
		
		//PersonaActiveRecord p1= new PersonaActiveRecord("maria");
		//p1.borrar();
		
		
		try {
			PersonaActiveRecord p=PersonaActiveRecord.buscarUno("pepe");
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
			System.out.println(p.getEdad());
		} catch (Exception e) {
			System.out.println("main");
			e.printStackTrace();
			System.out.println("main");
		}
		
	}

	
	
	

}
