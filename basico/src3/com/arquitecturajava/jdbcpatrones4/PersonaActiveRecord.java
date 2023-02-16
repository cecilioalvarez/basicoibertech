package com.arquitecturajava.jdbcpatrones4;

import java.util.List;

public class PersonaActiveRecord {

	private String nombre;
	private String apellidos;
	private int edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

	public PersonaActiveRecord() {
		super();
	}

	public PersonaActiveRecord(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public PersonaActiveRecord(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static List<PersonaActiveRecord> buscarTodos() {

		DataBaseHelper helper = new DataBaseHelper();
		String sql = "select * from personas";
		return  helper.seleccionar(sql,PersonaActiveRecord.class);
			
		
	}

	public static PersonaActiveRecord buscarUno(String nombre) {

		DataBaseHelper helper = new DataBaseHelper();
		String sql = "select * from personas where nombre'" + nombre + "'";
		return  helper.seleccionar(sql,PersonaActiveRecord.class).get(0);
		
	}

	public void insertar() {

		DataBaseHelper helper = new DataBaseHelper();
		String sql = "insert into Personas  (nombre,apellidos,edad) values ('" + this.getNombre() + "','"
				+ this.getApellidos() + "'," + this.getEdad() + ")";
		helper.actualizar(sql);

	}

	public void borrar() {

		DataBaseHelper helper = new DataBaseHelper();

		String sql = "delete from Personas where nombre='" + this.getNombre() + "'";

		helper.actualizar(sql);

	}

	@Override
	public String toString() {
		return "PersonaActiveRecord [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

}
