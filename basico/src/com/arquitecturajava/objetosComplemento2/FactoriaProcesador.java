package com.arquitecturajava.objetosComplemento2;

public class FactoriaProcesador {

	public Procesador getProcesador(String tipo) {
		
		if (tipo.equals("tipoA")) {
			
			return new ProcesadorA();
		}else {
			
			return new ProcesadorB();
		}
	}
}
