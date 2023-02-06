package com.arquitecturajava.objetos4;

public class Libro {

	private String titulo;
	
	// no es un tipo basico sino que es un objeto
	
	private Autor autor;

	public String getTitulo() {
		return titulo;
	}

	
	public String getNombre() {
		return autor.getNombre();
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	

	/*
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	*/
	
	
	public Libro(String titulo, Autor autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}
	
	
	
}
