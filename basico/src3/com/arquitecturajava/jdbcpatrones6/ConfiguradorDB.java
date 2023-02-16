package com.arquitecturajava.jdbcpatrones6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfiguradorDB {

	private String url;
	private String user;
	private String password;
	private static ConfiguradorDB cdb= new ConfiguradorDB();

	public  static ConfiguradorDB getInstance() {
		
		return cdb;
	}
	
	
	private ConfiguradorDB() {
		
		System.out.println("pasamos por el cosntructor");
				
		try (FileInputStream fos = new FileInputStream("database.properties");) {
			Properties p = new Properties();

			p.load(fos);
			user = p.getProperty("user");
			password = p.getProperty("password");
			url = p.getProperty("url");
		} catch (IOException e) {
			// cancelacion de excepciones
			System.out.println("logfichero configurador");
			e.printStackTrace();
			System.out.println("logfichero configurador");
			throw new RuntimeException(e);
		}

	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

}
