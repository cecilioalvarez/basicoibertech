package com.arquitecturajava.colecciones4;

public class PrincipalPaises2 {

	public static void main(String[] args) {
		
		
		GestorPaises gestor= new GestorPaises();
		gestor.addCiudadAPais(new Pais("Francia"), new Ciudad("Paris",5000_000));
		gestor.addCiudadAPais(new Pais("Francia"), new Ciudad("Toolose",1000_000));
		gestor.addCiudadAPais(new Pais("Francia"), new Ciudad("Nantes",500_000));
		
		
		gestor.addCiudadAPais(new Pais("España"), new Ciudad("Madrid",7000_000));
		gestor.addCiudadAPais(new Pais("España"), new Ciudad("Bilbao",1000_000));
		gestor.addCiudadAPais(new Pais("España"), new Ciudad("Barcelona",300_000));
		
		
		System.out.println(gestor.gestCiudadMasGrandeDelMundo());
	}

}
