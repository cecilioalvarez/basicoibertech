package com.arquitecturajava.objetosComplemento3;

public class Principal {

	public static void main(String[] args) {
		
		
		Gimnasio g= new Gimnasio();
		
		g.addSocio(new SocioVip());
		g.addSocio(new SocioNormal());
		g.addSocio(new SocioNiño());
		
		System.out.println(g.ingresosTotales());
	}
}
