package com.arquitecturajava.jdbcpatrones5;

import java.util.List;

public class PersonaRepository {

	
	
	public  List<Persona> buscarTodos() {

		String sql = "select * from personas";
		return  getHelper().seleccionar(sql,Persona.class);
			
		
	}
	
	public  List<Persona> buscarTodos(String orden) {

		String sql = "select * from personas order by " +orden;
		return  getHelper().seleccionar(sql,Persona.class);
			
		
	}

	private DataBaseHelper getHelper() {
		DataBaseHelper helper = new DataBaseHelper();
		return helper;
	}

	public  Persona buscarUno(String nombre) {

		
		String sql = "select * from personas where nombre ='" + nombre + "'";
		return  getHelper().seleccionar(sql,Persona.class).get(0);
		
	}

	public void insertar(Persona persona) {

		
		String sql = "insert into Personas  (nombre,apellidos,edad) values ('" + persona.getNombre() + "','"
				+ persona.getApellidos() + "'," + persona.getEdad() + ")";
		getHelper().actualizar(sql);

	}

	public void borrar(Persona persona) {

		

		String sql = "delete from Personas where nombre='" + persona.getNombre() + "'";

		getHelper().actualizar(sql);

	}
	
	public void actualizar(Persona persona) {

		

		String sql = "update Persona set apellidos='" + persona.getApellidos()
		+ "' , edad=" + persona.getEdad()+" where nombre='"+ persona.getNombre()+"'";

		getHelper().actualizar(sql);

	}

}
