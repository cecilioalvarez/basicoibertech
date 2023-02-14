package com.arquitecturajava.colecciones5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalJDBC {

	public static void main(String[] args) {

		Connection con = null;
		Statement s = null;
		ResultSet rs = null;

		try {
			// Obtener una conexión a base de datos y preparar una sentencia.
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boot", "root", "root");

			s = con.createStatement();

			rs = s.executeQuery("SELECT * FROM  Personas");

			while (rs.next()) {

				System.out.println("   Fila  " + rs.getString("nombre"));
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error grave: no se puede cerrar el objeto conexión");
				}
			}
		}

	}

}
