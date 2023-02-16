package com.arquitecturajava.jdbcpatrones6;

import java.util.List;

public interface PersonaRepository {

	List<Persona> buscarTodos();

	List<Persona> buscarTodos(String orden);

	List<Persona> buscarTodos(String orden, String direccion);

	Persona buscarUno(String nombre);

	void insertar(Persona persona);

	void borrar(Persona persona);

	void actualizar(Persona persona);

}