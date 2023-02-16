package com.arquitecturajava.jdbcpatrones4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionHelper {

	
	
	public static void cambiarPropiedad(Object o, String propiedad, Object valor) {

		propiedad = propiedad.substring(0, 1).toUpperCase() + propiedad.substring(1);
		propiedad = "set" + propiedad;

		Class<?> clase = (Class<?>) o.getClass();

		Method[] metodos = clase.getDeclaredMethods();

		Method m = buscarMetodo(metodos, propiedad);

		try {
			m.invoke(o, valor);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	private static Method buscarMetodo(Method[] metodos, String nombre) {

		for (Method m : metodos) {

			if (m.getName().equals(nombre)) {
				return m;
			}
		}
		return null;
	}
}
