package basico2;

import java.util.ArrayList;
import java.util.List;

public class Asignador<T,K> {

	private List<T> inicial= new ArrayList<T>();
	private List<K> resultado= new ArrayList<K>();
	
	public void addPareja(T tipo, K otroTipo) {
		
		inicial.add(tipo);
		resultado.add(otroTipo);
	}
	
	public K getResultado(T tipo) {
		
		int indice=inicial.indexOf(tipo);
		return resultado.get(indice);
	}
	
}
