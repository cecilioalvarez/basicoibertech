package com.arquitecturajava.complementario;

import java.util.Objects;

public class Rectangulo {

	private int lado1;
	private int lado2;
	//una instancia de una claes
	// a un objeto que tenemos creado
	private static  int contador=0;
	
	public Rectangulo(int lado1, int lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		contador++;
	}
	public static int  getContador() {
		 return contador;
	}
	public static void setContador(int contador) {
		Rectangulo.contador = contador;
	}
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
	
	
	public double perimetro() {
		
		return lado1*2+ lado2*2;
	}
	
	//poo este es mas sencillo y hace lo mismo
	//sino que es mas natural con la programacion oo
	public double area() {
		
		return Rectangulo.area(this.getLado1(), this.getLado2());
	}
	// este es mas flexible
	public static double area(double lado1 , double lado2) {
		
		return lado1*lado2;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(lado1, lado2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		return lado1 == other.lado1 && lado2 == other.lado2;
	}
	
	
	
}
