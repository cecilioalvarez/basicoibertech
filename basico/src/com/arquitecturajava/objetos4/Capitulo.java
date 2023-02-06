package com.arquitecturajava.objetos4;

public class Capitulo implements Comparable<Capitulo> {

	private String titulo;
	private int paginas;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public Capitulo(String titulo, int paginas) {
		super();
		this.titulo = titulo;
		this.paginas = paginas;
	}
	@Override
	public int compareTo(Capitulo o) {
		// TODO Auto-generated method stub
		return this.getTitulo().compareTo(o.getTitulo());
	}
	
	
}
