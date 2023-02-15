package com.arquitecturajava.colecciones5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalJDBC8 {

	public static void main(String[] args) {

		//insertarPersona( new Persona ("paquito","sanchez",10));

		//borrarPersona(new Persona("paquito"));
		seleccionarPersonas();
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
	
	public static void seleccionarPersonas() {

		DataBaseHelper helper = new DataBaseHelper();

		String sql = "select * from personas";

		try (Statement st = helper.seleccionar(sql);
				Connection con= st.getConnection();
				ResultSet rs =st.getResultSet()) {

			while (rs.next()) {

				System.out.println(rs.getString("nombre"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
