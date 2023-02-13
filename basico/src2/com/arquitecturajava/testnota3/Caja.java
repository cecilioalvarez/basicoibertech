package com.arquitecturajava.testnota3;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	
	private double peso;
	private List<Azulejo> azulejos= new ArrayList<Azulejo>();
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public List<Azulejo> getAzulejos() {
		return azulejos;
	}
	public void setAzulejos(List<Azulejo> azulejos) {
		this.azulejos = azulejos;
	}



	public Caja(double peso, List<Azulejo> azulejos) {
		this.azulejos=azulejos;
		this.peso=peso;
	}
	public double calcularPesoTotal() {
		
		double total=peso;
		
		for (Azulejo azulejo:azulejos) {
			
			total+=azulejo.getPeso();
		}
		return total;
		
		
	}

}
