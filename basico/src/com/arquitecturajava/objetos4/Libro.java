package com.arquitecturajava.objetos4;

import java.util.ArrayList;

public class Libro {

	private String titulo;
	ArrayList<Capitulo> capitulos = new ArrayList<>();

	public void addCapitulo(Capitulo c) {

		this.capitulos.add(c);

	}

	public Capitulo capituloMasLargo() {

		Capitulo seleccionado = capitulos.get(0);

		for (Capitulo c : capitulos) {

			if (seleccionado.getPaginas() < c.getPaginas()) {

				seleccionado = c;
			}

		}
		return seleccionado;

	}

	public ArrayList<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(ArrayList<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

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
	 * public Autor getAutor() { return autor; }
	 * 
	 * public void setAutor(Autor autor) { this.autor = autor; }
	 * 
	 */

	public Libro(String titulo, Autor autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

}
