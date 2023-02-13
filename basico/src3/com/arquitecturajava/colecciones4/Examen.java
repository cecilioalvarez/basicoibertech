package com.arquitecturajava.colecciones4;

import java.time.LocalDate;
import java.util.Objects;

public class Examen implements Comparable<Examen> {

	private String nombre;
	private LocalDate fecha;
	private String asignatura;
	private double nota;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Examen(String nombre, LocalDate fecha, String asignatura, double nota) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.asignatura = asignatura;
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asignatura, fecha, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Examen other = (Examen) obj;
		return Objects.equals(asignatura, other.asignatura) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Examen e) {

		if (this.getNota() > e.getNota()) {
			return 1;
		} else if (this.getNota() == e.getNota()) {
			
			return this.nombre.compareTo(e.getNombre());
			
		} else {
			return -1;
		}
	}

}
