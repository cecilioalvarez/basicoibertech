package com.arquitecturajava.jdbcpatrones5;

import java.util.List;

public class PersonaRepository {

	
	
	public  List<Persona> buscarTodos() {

		DataBaseHelper helper = new DataBaseHelper();
		String sql = "select * from personas";
		return  helper.seleccionar(sql,Persona.class);
			
		
	}

	public  Persona buscarUno(String nombre) {

		DataBaseHelper helper = new DataBaseHelper();
		String sql = "select * from personas where nombre'" + nombre + "'";
		return  helper.seleccionar(sql,Persona.class).get(0);
		
	}

	public void insertar(Persona persona) {

		DataBaseHelper helper = new DataBaseHelper();
		String sql = "insert into Personas  (nombre,apellidos,edad) values ('" + persona.getNombre() + "','"
				+ persona.getApellidos() + "'," + persona.getEdad() + ")";
		helper.actualizar(sql);

	}

	public void borrar(Persona persona) {

		DataBaseHelper helper = new DataBaseHelper();

		String sql = "delete from Personas where nombre='" + persona.getNombre() + "'";

		helper.actualizar(sql);

	}

}
