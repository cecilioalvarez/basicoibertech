package com.arquitecturajava.jdbcpatrones2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Principal2 {

	public static void main(String[] args) {

		PersonaActiveRecord p = new PersonaActiveRecord("pepe", "perez", 20);

		Factura f = new Factura("1", "ordenador", 200);
		cambiarPropiedades(p);
		cambiarPropiedades(f);
		System.out.println("****");

	}

	public static void cambiarPropiedades(Object o) {

		Class<?> clase = (Class<?>) o.getClass();

		Method[] metodos = clase.getDeclaredMethods();

		for (Method metodo : metodos) {
			Object dato = null;
			String metodoSet=null;
			if (metodo.getName().startsWith("get")) {
				// System.out.println(metodo.getName());
				try {
					metodoSet=metodo.getName().substring(3);
					metodoSet="set"+metodoSet;
					//System.out.println(metodoSet);
				//	System.out.println(metodo.invoke(o));
					dato = metodo.invoke(o);
					System.out.println(dato);
					
					// buscame el metodo set que complementa a este get
					Method m=buscarMetodo(metodos, metodoSet);
					
					//System.out.println("nombre metodo :"+m.getName());
					//System.out.println(" tipo de dato"+dato.getClass());
					
					if (dato.getClass().getName().equals("java.lang.String")) {
						
						m.invoke(o, "holastring");
						
					}else if (dato.getClass().getName().equals("java.lang.Integer")) {
						
						m.invoke(o, 12345);
					}else {
						m.invoke(o, 12345.123);
					}
					
					
					dato = metodo.invoke(o);
					System.out.println(dato);
					
					
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

		System.out.println("****");

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
