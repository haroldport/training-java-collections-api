package com.arquitecturajava.ejemplo004;

public class Principal {
	
	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Java", "Harold");
		libro1.addCapitulo(new Capitulo("Introduccion", 25));
		libro1.addCapitulo(new Capitulo("Tipos basicos", 20));
		
		System.out.println(libro1.totalCapitulos());
		System.out.println(libro1.totalPaginas());
		System.out.println(libro1.contieneCapitulo(new Capitulo("Introduccion", 25)));
		
		for(Capitulo c: libro1.getListaCapitulos()) {
			System.out.println(c.getTitulo());
		}
		
		libro1.cambiarCapitulo(new Capitulo("Introduccion", 25), new Capitulo("Introduccion cambiado", 15));
		for(Capitulo c: libro1.getListaCapitulos()) {
			System.out.println(c.getTitulo());
		}
	}

}
