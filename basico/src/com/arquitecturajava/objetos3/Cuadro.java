package com.arquitecturajava.objetos3;

public class Cuadro {

	private int lado1;
	private int lado2;
	private String titulo;
	private int marco;
	
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getMarco() {
		return marco;
	}
	public void setMarco(int marco) {
		this.marco = marco;
	}
	public Cuadro(String titulo, int lado1, int lado2,  int marco) {
		
		//reutilio el codigo
		this(titulo,lado1,lado2);
		this.marco = marco;
	}
	
	
	
	public Cuadro( String titulo,int lado1, int lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.titulo = titulo;
	}
	
	
	public int getSuperficie() {
		
		return (ladoConMarco(lado1)*ladoConMarco(lado2));
	}
	
	private int ladoConMarco(int lado) {
		
		return lado+ marco*2;
	}
	
	
}
