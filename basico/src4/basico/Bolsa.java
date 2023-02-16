package basico;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T extends Producto> {

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
	
	public double precioFinal() {
		
		double total=0;
		for (Producto p: lista) {
			
			total+=p.getPrecio();
			
		}
		return total;
	}
	
}
