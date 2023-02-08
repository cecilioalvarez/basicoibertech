package com.arquitecturajava.objetosComplemento5;

public class CocheEnchufable implements VehiculoEnchufable {

	@Override
	public void cargar() {
	System.out.println("el coche enchufalle se carga de froma electrica");

	}

	@Override
	public void llenar() {
		
		System.out.println("el coche enchufable se llena de gasolina");

	}

}
