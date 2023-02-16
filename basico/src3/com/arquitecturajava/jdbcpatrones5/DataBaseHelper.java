package com.arquitecturajava.jdbcpatrones5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper {

	
	public void actualizar(String sql) {

		ConfiguradorDB c = ConfiguradorDB.getInstance();

		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
				Statement s = con.createStatement();) {
			s.executeUpdate(sql);

		} catch (SQLException e) {

			System.out.println("logficheroSQL");
			e.printStackTrace();
			System.out.println("logficheroSQL");
			throw new RuntimeException(e);
		}
	}

	public static <T> List<T> seleccionar(String sql, Class<T> tipo) {

		String[] lista = null;
		ConfiguradorDB c = ConfiguradorDB.getInstance();
		List<T> listaObjetos = new ArrayList<T>();
		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery(sql)) {

			ResultSetMetaData rsmd = rs.getMetaData();
			int filas = rsmd.getColumnCount();
			lista = new String[filas];

			lista[0] = rsmd.getColumnName(1);
			lista[1] = rsmd.getColumnName(2);
			lista[2] = rsmd.getColumnName(3);

			while (rs.next()) {

				Class<T> clazz = (Class<T>) Class.forName(tipo.getName());
				Constructor<?> ctor = clazz.getConstructor();
				T objetoGenerico = (T) ctor.newInstance(new Object[] {});

				ReflectionHelper.cambiarPropiedad(objetoGenerico, lista[0], rs.getString(lista[0]));
				ReflectionHelper.cambiarPropiedad(objetoGenerico, lista[1], rs.getString(lista[1]));
				ReflectionHelper.cambiarPropiedad(objetoGenerico, lista[2], rs.getInt(lista[2]));

				listaObjetos.add(objetoGenerico);

			}

		} catch (SQLException | ClassNotFoundException | NoSuchMethodException | SecurityException
				| InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return listaObjetos;
	}

}
