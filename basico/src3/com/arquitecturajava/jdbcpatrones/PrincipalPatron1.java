package com.arquitecturajava.jdbcpatrones;

import java.sql.SQLException;
import java.util.List;



public class PrincipalPatron1 {

	public static void main(String[] args) {

		//insertarPersona( new PersonaActiveRecord ("paquito","sanchez",10));

		//borrarPersona(new PersonaActiveRecord("paquito"));
		
		List<PersonaActiveRecord> lista=PersonaActiveRecord.buscarTodos();
		
		for (PersonaActiveRecord p:lista) {
			
			System.out.println(p.getNombre());
		}
		
		
	}

	public static void insertarPersona(PersonaActiveRecord persona) {

		DataBaseHelper helper = new DataBaseHelper();
		String sql = "insert into Personas  (nombre,apellidos,edad) values ('" + persona.getNombre() + "','"
				+ persona.getApellidos() + "'," + persona.getEdad() + ")";
		try {
			helper.actualizar(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void borrarPersona(PersonaActiveRecord persona) {

		DataBaseHelper helper = new DataBaseHelper();

		String sql = "delete from Personas where nombre='" + persona.getNombre() + "'";
		try {
			helper.actualizar(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
