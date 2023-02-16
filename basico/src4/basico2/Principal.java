package basico2;

import basico.Caramelo;

public class Principal {

	public static void main(String[] args) {
	
		
		
		Asignador<Persona, Premio> asignador= new Asignador<Persona,Premio>();
		
		asignador.addPareja(new Persona("juan"), new Premio("ordenador",1000));

		
		System.out.println(asignador.getResultado(new Persona("juan")).getNombre());
		System.out.println(asignador.getResultado(new Persona("juan")).getImporte());
		
		
		Asignador<Caramelo, Premio> asignador2= new Asignador<Caramelo,Premio>();
	}

}
