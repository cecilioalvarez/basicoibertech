package com.arquitecturajava.testnota;

import java.util.ArrayList;
import java.util.List;

public class GrupoNotas {

	
	private List<Nota> notas= new ArrayList<>();

	
	public GrupoNotas() {
		super();
	}

	public GrupoNotas(List<Nota> notas) {
		super();
		this.notas = notas;
	}

	public boolean add(Nota e) {
		return notas.add(e);
	}

	public boolean remove(Object o) {
		return notas.remove(o);
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	
	public double notaMedia() {
		
		double total=0;
		
		for (Nota n: notas) {
			
			total+= n.getValor();
		}
		return total/notas.size();
	}
	
	
}
