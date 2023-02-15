package com.arquitecturajava.colecciones5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfiguradorDB {

	private String url;
	private String user;
	private String password;
	
	
	
	public ConfiguradorDB() {
		
		Properties p= new Properties();
		try {
			p.load( new FileInputStream("database.properties"));
			user= p.getProperty("user");
			password=p.getProperty("password");
			url=p.getProperty("url");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
