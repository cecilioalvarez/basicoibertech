package com.arquitecturajava.colecciones4;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal2 {

	public static void main(String[] args) {
		
		Set<Examen> conjunto= new TreeSet<Examen>(new ExamenNombreComprator());
		
		Examen e1= new Examen("pedro",LocalDate.now(),"matematicas",7);
		Examen e2= new Examen("juan",LocalDate.now(),"matematicas",8);
		Examen e3= new Examen("pedrito",LocalDate.now(),"matematicas",7);
		Examen e4= new Examen("ana",LocalDate.now(),"matematicas",2);
		Examen e5= new Examen("pedro",LocalDate.now(),"matematicas",7.1);
		Examen e6= new Examen("jessica",LocalDate.now(),"matematicas",5.1);
		Examen e7= new Examen("blanca",LocalDate.now(),"matematicas",7.3);
		Examen e8= new Examen("ana",LocalDate.now(),"matematicas",9);
		
		
		conjunto.add(e1);
		conjunto.add(e2);
		conjunto.add(e3);
		conjunto.add(e4);
		conjunto.add(e5);
		conjunto.add(e6);
		conjunto.add(e7);
		conjunto.add(e8);
		
		for (Examen examen: conjunto) {
			System.out.println(examen.getNombre());
			System.out.println(examen.getAsignatura());
			System.out.println(examen.getNota());
		}
		

	}

}
