package com.arquitecturajava.colecciones5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ManejoProperties {

	public static void main(String[] args) {
		
		try {
			Properties p= new Properties();
			 p.load(new FileInputStream(new File("prueba.properties")));
			 System.out.println(p.get("nombre"));
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
				
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
