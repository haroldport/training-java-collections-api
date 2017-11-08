package com.arquitecturajava.ejemplo002;

import java.util.ArrayList;
import java.util.Collection;

public class Principal {

	public static void main(String[] args) {
		
		Collection<String> lista = new ArrayList<>();
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		
		System.out.println(lista.contains("tal"));
		lista.addAll(lista);
		
		System.out.println(lista.size());
		
		for(String c: lista) {
			System.out.println(c);
		}
		
		//lista.clear();
		
		System.out.println(lista.isEmpty());
		
		lista.remove("que");
		System.out.println("*********");
		for(String c: lista) {
			System.out.println(c);
		}
		

	}

}
