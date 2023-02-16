package com.arquitecturajava.jdbcpatrones2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DataBaseHelper {

	public void actualizar(String sql) {

		ConfiguradorDB c = new ConfiguradorDB();

		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
				Statement s = con.createStatement();) {
			s.executeUpdate(sql);

		} catch (SQLException e) {

			System.out.println("logficheroSQL");
			e.printStackTrace();
			System.out.println("logficheroSQL");
			throw new RuntimeException(e);
		}
	}

//	public  <T> List<T> seleccionar(String sql, Class<T> tipo) throws SQLException {
//
//		ConfiguradorDB c = new ConfiguradorDB();
//
//		Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
//		Statement s = con.createStatement();
//		ResultSet rs=s.executeQuery(sql);
//		
//		tipo.getClass().getName();
//		
//
//	}

}
