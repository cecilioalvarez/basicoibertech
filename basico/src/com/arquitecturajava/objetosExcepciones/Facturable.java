package com.arquitecturajava.objetosExcepciones;

public interface Facturable {
	
	double importeTotal();
	static Facturable esMasUrgente(Facturable a , Facturable b) {
		
		return a.importeTotal()>b.importeTotal()?a:b;
	}
	default Facturable esMasUrgente(Facturable b) {
		
		return esMasUrgente(this,b);
	}

}
