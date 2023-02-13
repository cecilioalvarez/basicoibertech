package com.arquitecturajava.testnota3;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	
	private double peso;
	private List<Azulejo> azulejos= new ArrayList<Azulejo>();
	private int tope;
	
	public int getTope() {
		return tope;
	}
	
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


	public void addAzulejo(Azulejo azulejo) {
		
		if (this.azulejos.size()==tope) 
			throw new IllegalArgumentException("tamaño excedido");
		
		this.azulejos.add(azulejo);
	}

	public Caja(double peso, List<Azulejo> azulejos) {
		this.azulejos=azulejos;
		this.peso=peso;
		this.tope=10;
	}
	
	public Caja(double peso, List<Azulejo> azulejos, int tope) {
		super();
		this.peso = peso;
		this.azulejos = azulejos;
		this.tope = tope;
	}
	public double calcularPesoTotal() {
		
		double total=peso;
		
		for (Azulejo azulejo:azulejos) {
			
			total+=azulejo.getPeso();
		}
		return total;
		
		
	}
	public void removeAzulejo(Azulejo azulejoEliminar) {
		
		
		azulejos.remove(azulejoEliminar);
		
	}

}
