package com.arquitecturajava.complementario;

public class PrincipalCadena2 {

	public static void main(String[] args) {
		
		//inmutable
		String s1= "hola";
		String s2= new String ("hola2");
		String s3="hola";
		
		//primero se genera un obejto adios
		// como ese objeto no existia se le pool de cadenas
		// no hay nada que haer
		// se suman y porlo tanto se genera un nuevo objeto
		// que contiene "adios"+"hola"
		s3="adios"+"hola";
		
		
		
		
		
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1==s2); //false
		System.out.println(s3==s1); //false
	}
	
}
