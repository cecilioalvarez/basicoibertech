package com.arquitecturajava.jdbcpatrones;

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
		
		PersonaActiveRecord p1= new PersonaActiveRecord("maria");
		p1.borrar();
		
	}

	
	
	

}