package com.arquitecturajava.colecciones5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalJDBC6 {

	public static void main(String[] args) {

		insertarPersona( new Persona ("paquito","sanchez",10));

		//borrarPersona(new PersonaActiveRecord("paquito"));
	}

	public static void insertarPersona(Persona persona) {

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

	public static void borrarPersona(Persona persona) {

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
