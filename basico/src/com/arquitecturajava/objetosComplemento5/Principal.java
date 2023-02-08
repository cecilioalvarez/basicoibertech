package com.arquitecturajava.objetosComplemento5;

public class Principal {

	public static void main(String[] args) {
		
		
		Coche c= new Coche();
		Gasolinera g= new Gasolinera();
		g.llenarDeposito(c);
		
		CocheElectrico ce= new CocheElectrico();
		
		ce.cargar();
		
		g.cargar(ce);
		
		VehiculoEnchufable cen= new CocheEnchufable();
		
		g.cargar(cen);
		g.llenarDeposito(cen);

	}

}
