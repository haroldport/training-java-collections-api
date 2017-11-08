package com.arquitecturajava.ejemplo006;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		Map<String, String> diccionario = new HashMap<>();
		diccionario.put("nombre", "Harold");
		diccionario.put("apellidos", "Portocarrero");
		diccionario.put("ciudad", "Guayaquil");
		
		System.out.println(diccionario.get("nombre"));
		
		Persona p1 = new Persona("Pedro", "Herrera", "Quito");
		Persona p2 = new Persona("Carlos", "Orejuela", "Cuenca");
		Persona p3 = new Persona("Pamela", "Lopez", "Ambato");
		Map<String, Persona> diccionarioPersona = new HashMap<>();
		diccionarioPersona.put("pedro", p1);
		diccionarioPersona.put("carlos", p2);
		diccionarioPersona.put("pamela", p3);
		
		System.out.println(diccionarioPersona.get("carlos"));
		
		Set<String> claves = diccionarioPersona.keySet();
		
		for(String clave: claves) {
			System.out.println(diccionarioPersona.get(clave));
		}
		
	}

}
