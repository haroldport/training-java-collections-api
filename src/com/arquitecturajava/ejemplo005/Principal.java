package com.arquitecturajava.ejemplo005;

import java.util.HashSet;

public class Principal {

	public static void main(String[] args) {
		
		HashSet<String> conjunto = new HashSet<>();
		conjunto.add("hola");
		conjunto.add("que");
		conjunto.add("tal");
		conjunto.add("hola");
		
		//no sale ordenado
		for(String c: conjunto) { 
			System.out.println(c);
		}
		
		HashSet<Persona> conjunto2 = new HashSet<>();
		Persona p1 = new Persona("Pedro");
		Persona p2 = new Persona("Juan");
		Persona p3 = new Persona("Juan");
		conjunto2.add(p1);
		conjunto2.add(p2);
		conjunto2.add(p3);
		for(Persona p: conjunto2) { 
			System.out.println(p.getNombre());
		}

	}

}
