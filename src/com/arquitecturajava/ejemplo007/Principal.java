package com.arquitecturajava.ejemplo007;

import java.util.Set;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		
		//es un conjunto sin ordenar
		//Set<String> conjunto = new HashSet<>();
		Set<String> conjunto = new TreeSet<>();
		//no sale en el mismo orden que lo insertamos
		conjunto.add("hola");
		conjunto.add("que");
		conjunto.add("tal");
		conjunto.add("estas");
		conjunto.add("amigo");		
//		for(String texto: conjunto) {
//			System.out.println(texto);
//		}
		
		Set<Persona> conjuntoPersonas = new TreeSet<>();
		Persona p1 = new Persona("Pedro", "Herrera", "Quito");
		Persona p2 = new Persona("Carlos", "Orejuela", "Cuenca");
		Persona p3 = new Persona("Pamela", "Lopez", "Ambato");
		conjuntoPersonas.add(p1);
		conjuntoPersonas.add(p2);
		conjuntoPersonas.add(p3);
		
		for(Persona p: conjuntoPersonas) {
			System.out.println(p);
		}
		
	}

}
