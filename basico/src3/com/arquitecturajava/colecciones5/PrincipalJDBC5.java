package com.arquitecturajava.colecciones5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalJDBC5 {

	public static void main(String[] args) {

		ConfiguradorDB c= new ConfiguradorDB();
		
		try (Connection con = DriverManager.getConnection(c.getUrl(),c.getUser(),c.getPassword());
				Statement s = con.createStatement();
				) {
			
			s.executeUpdate("delete from Personas where nombre='juanito'");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
