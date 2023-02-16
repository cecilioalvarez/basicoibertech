package com.arquitecturajava.jdbcpatrones6;
//package com.arquitecturajava.jdbcpatrones4;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//
//
//
//
//public class Principal2 {
//
//	public static void main(String[] args) {
//
////		PersonaActiveRecord p = new PersonaActiveRecord("pepe", "perez", 20);
////
////		Factura f = new Factura("1", "ordenador", 200);
////		cambiarPropiedades(p);
////		cambiarPropiedades(f);
////		System.out.println("****");
//		
//		//List<Persona> lista=consultaSQL("select * from Personas", Persona.class);
//		
//		List<Factura> lista2=consultaSQL("select * from Facturas", Factura.class);
//		
//		for (Factura f: lista2) {
//			
//			System.out.println(f.getConcepto());
//			System.out.println(f.getImporte());
//			System.out.println(f.getNumero());
//		}
//		
//		
//		List<Persona> lista3=consultaSQL("select * from Personas", Persona.class);
//		
//		for (Persona p: lista3) {
//			
//			System.out.println(p.getNombre());
//			System.out.println(p.getApellidos());
//			System.out.println(p.getEdad());
//		}
//		
//		/*
//		Factura f= new Factura();
//		
//		cambiarPropiedad(f, "concepto", "ordenador");
//		
//		System.out.println(f.getConcepto());
//		
//		*/
//	}
//	// nombre, setNombre
//	public static void cambiarPropiedad(Object o,String propiedad , Object valor) {
//
//		propiedad= propiedad.substring(0, 1).toUpperCase() + propiedad.substring(1);
//		propiedad="set"+propiedad;
//		
//		
//		Class<?> clase = (Class<?>) o.getClass();
//		
//		Method[] metodos = clase.getDeclaredMethods();
//		
//		Method m=buscarMetodo(metodos, propiedad);
//					
//		try {
//			m.invoke(o, valor);
//		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//						
//	}
//	
//	
//	
//
//	public static void cambiarPropiedades(Object o) {
//
//		Class<?> clase = (Class<?>) o.getClass();
//
//		Method[] metodos = clase.getDeclaredMethods();
//
//		for (Method metodo : metodos) {
//			Object dato = null;
//			String metodoSet=null;
//			if (metodo.getName().startsWith("get")) {
//				// System.out.println(metodo.getName());
//				try {
//					metodoSet=metodo.getName().substring(3);
//					metodoSet="set"+metodoSet;
//					//System.out.println(metodoSet);
//				//	System.out.println(metodo.invoke(o));
//					dato = metodo.invoke(o);
//					System.out.println(dato);
//					
//					// buscame el metodo set que complementa a este get
//					Method m=buscarMetodo(metodos, metodoSet);
//					
//					//System.out.println("nombre metodo :"+m.getName());
//					//System.out.println(" tipo de dato"+dato.getClass());
//					
//					if (dato.getClass().getName().equals("java.lang.String")) {
//						
//						m.invoke(o, "holastring");
//						
//					}else if (dato.getClass().getName().equals("java.lang.Integer")) {
//						
//						m.invoke(o, 12345);
//					}else {
//						m.invoke(o, 12345.123);
//					}
//					
//					
//					dato = metodo.invoke(o);
//					System.out.println(dato);
//					
//					
//				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//		}
//
//		System.out.println("****");
//
//	}
//	
//	private static Method buscarMetodo(Method[] metodos, String nombre) {
//		
//		for (Method m : metodos) {
//			
//			if (m.getName().equals(nombre)) {
//				return m;
//			}
//		}
//		return null;
//	}
//
//	private static <T> List<T> consultaSQL(String sql , Class<T> tipo) {
//		
//		String[] lista = null;
//		ConfiguradorDB c = new ConfiguradorDB();
//		List<T> listaObjetos=new ArrayList<T>();
//		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
//				Statement s = con.createStatement();
//				ResultSet rs = s.executeQuery(sql)) {
//			
//			ResultSetMetaData rsmd= rs.getMetaData();
//			int filas= rsmd.getColumnCount();
//			lista = new String[filas];
//			
//			lista[0]=rsmd.getColumnName(1);
//			lista[1]=rsmd.getColumnName(2);
//			lista[2]=rsmd.getColumnName(3);
//			
//			while (rs.next()) {
//				
//					Class<T> clazz =(Class<T>) Class.forName(tipo.getName());
//					Constructor<?> ctor = clazz.getConstructor();
//					T objetoGenerico = (T)ctor.newInstance(new Object[] {  });
//					
//					cambiarPropiedad(objetoGenerico, lista[0], rs.getString(lista[0]));
//					cambiarPropiedad(objetoGenerico, lista[1], rs.getString(lista[1]));
//					cambiarPropiedad(objetoGenerico, lista[2], rs.getInt(lista[2]));
//					
//					listaObjetos.add(objetoGenerico);
//				
//			}
//			
//		} catch (SQLException | ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			throw new RuntimeException(e);
//		}
//		return listaObjetos;
//	}
//	
//}
