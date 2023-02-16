package basico;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {

	private List<T> lista= new ArrayList<>();
	private int tope;
	
	public void addElemento(T c) {
		
		if (lista.size()<tope) 
		lista.add(c);
	}
	public List<T> getLista() {
		return lista;
	}
	public void setLista(List<T> lista) {
		this.lista = lista;
	}
	public int getTope() {
		return tope;
	}
	public void setTope(int tope) {
		this.tope = tope;
	}
	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}
	
	
}
