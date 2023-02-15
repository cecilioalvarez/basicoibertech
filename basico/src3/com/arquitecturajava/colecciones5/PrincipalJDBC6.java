package com.arquitecturajava.colecciones5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalJDBC6 {

	public static void main(String[] args) {

		// insertarPersona( new Persona ("paquito","sanchez",10));
		
		borrarPersona (new Persona ("paquito"));
	}

	public static void insertarPersona(Persona persona) {

		ConfiguradorDB c = new ConfiguradorDB();

		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
				Statement s = con.createStatement();) {

			String sql = "insert into Personas  (nombre,apellidos,edad) values ('"
					+persona.getNombre()+ "','" + persona.getApellidos()+"',"+persona.getEdad()+")";
			System.out.println(sql);
			s.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public static void borrarPersona(Persona persona) {

		ConfiguradorDB c = new ConfiguradorDB();

		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
				Statement s = con.createStatement();) {

			String sql = "delete from Personas where nombre='"+ persona.getNombre()+"'";
					
			System.out.println(sql);
			s.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
