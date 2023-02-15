package com.arquitecturajava.jdbcpatrones2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Principal2 {

	public static void main(String[] args) {

		PersonaActiveRecord p = new PersonaActiveRecord("pepe", "perez", 20);

		Factura f= new Factura("1","ordenador",200);
		imprimirPropiedades(p);
		imprimirPropiedades(f);
		System.out.println("****");

	}

	public static void imprimirPropiedades(Object o) {

		Class<?> clase = (Class<?>) o.getClass();

		Method[] metodos = clase.getDeclaredMethods();

		for (Method metodo : metodos) {

			if (metodo.getName().startsWith("get")) {
				//System.out.println(metodo.getName());
				try {
					System.out.println(metodo.invoke(o, null));
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		System.out.println("****");

	}

}
