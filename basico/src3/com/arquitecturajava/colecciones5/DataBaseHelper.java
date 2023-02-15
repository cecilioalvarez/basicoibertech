package com.arquitecturajava.colecciones5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseHelper {

	public void actualizar(String sql) throws SQLException {

		ConfiguradorDB c = new ConfiguradorDB();

		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
				Statement s = con.createStatement();) {
			s.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	public Statement seleccionar(String sql) throws SQLException {

		ConfiguradorDB c = new ConfiguradorDB();

		try {
			
			Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
			Statement s = con.createStatement();
			s.executeQuery(sql);
			return s;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

}
