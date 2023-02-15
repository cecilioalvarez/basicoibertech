package com.arquitecturajava.colecciones5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalJDBC {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boot", "root", "root");
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery("SELECT * FROM  Personas")) {
			while (rs.next()) {

				System.out.println("   Fila  " + rs.getString("nombre"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
