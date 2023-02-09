package com.arquitecturajava.objetos7;

import java.util.ArrayList;
import java.util.List;

public class PrincipalCasting {

	public static void main(String[] args) {

		List<Telefono> lista = new ArrayList<Telefono>();

		List<Conectable> conectados = encenderTodos(lista);
	}

	public static List<Conectable> encenderTodos(List<Telefono> lista) {

		List<Conectable> lista2 = new ArrayList<Conectable>();

		for (Conectable c : lista) {

			c.on();
			lista2.add(c);
		}

		return lista2;
	}

	public static void verPrecio(List<Conectable> lista) {

		List<Conectable> lista2 = new ArrayList<Conectable>();

		for (Conectable c : lista) {

			Telefono t = (Telefono) c;
			System.out.println(t.getPrecio());
		}

	}

}
