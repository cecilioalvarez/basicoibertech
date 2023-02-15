package com.arquitecturajava.jdbcpatrones2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
		List<PersonaActiveRecord> listaPersonas = new ArrayList<>();

		try (Statement st = helper.seleccionar(sql);
				Connection con = st.getConnection();
				ResultSet rs = st.getResultSet()) {

			while (rs.next()) {

				listaPersonas.add(
						new PersonaActiveRecord(rs.getString("nombre"), rs.getString("apellidos"), rs.getInt("edad")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("logficheroSQL");
			e.printStackTrace();
			System.out.println("logficheroSQL");
			throw new RuntimeException(e);
		}
		return listaPersonas;
	}

	public static PersonaActiveRecord buscarUno(String nombre) {

		DataBaseHelper helper = new DataBaseHelper();
		String sql = "select * from personas where nombre'" + nombre + "'";
		List<PersonaActiveRecord> listaPersonas = new ArrayList<>();
		PersonaActiveRecord persona = null;

		try (Statement st = helper.seleccionar(sql);
				Connection con = st.getConnection();
				ResultSet rs = st.getResultSet()) {

			rs.next();

			persona = new PersonaActiveRecord(rs.getString("nombre"), rs.getString("apellidos"), rs.getInt("edad"));

		} catch (SQLException e) {
		
			System.out.println("logficheroSQL");
			e.printStackTrace();
			System.out.println("logficheroSQL");
			throw new RuntimeException(e);
		}
		return persona;
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
