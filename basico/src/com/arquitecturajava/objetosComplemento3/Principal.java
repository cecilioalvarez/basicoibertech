package com.arquitecturajava.objetosComplemento3;

public class Principal {

	public static void main(String[] args) {
		
		
		Gimnasio g= new Gimnasio();
		
		g.addSocio(new SocioVip("ana"));
		g.addSocio(new SocioNormal("david"));
		g.addSocio(new SocioNiño("juan"));
		
		System.out.println(g.ingresosTotales());
	}
}
