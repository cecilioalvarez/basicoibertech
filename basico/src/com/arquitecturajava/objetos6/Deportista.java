package com.arquitecturajava.objetos6;

public class Deportista extends Persona {

	private String deporte;

	public String getDeporte() {
		return deporte;
	}
	

	public Deportista(String nombre, int edad, String deporte) {
		super(nombre, edad);
		this.deporte=deporte;
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void andar() {
		
		System.out.println("el deportista anda a 6km/h");
	}


	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	public void correr() {
		
		System.out.println("el deportista corre a 9km");
	}
	
}
