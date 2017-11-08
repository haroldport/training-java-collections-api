package com.arquitecturajava.ejemplo004;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class Libro {
	
	private String titulo;
	private String autor;
	private List<Capitulo> listaCapitulos;
	
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.listaCapitulos = new ArrayList<>();
	}
	
	public void addCapitulo(Capitulo c) {
		listaCapitulos.add(c);
	}
	
	public int totalCapitulos() {
		return listaCapitulos.size();
	}
	
	public int totalPaginas() {
		int total = 0;
		/*Iterator<Capitulo> it = listaCapitulos.iterator();
		while(it.hasNext()) {
			Capitulo c = it.next();
			total += c.getPaginas();
		}*/
		//foreach internamente esta usando el iterator
		for(Capitulo c: listaCapitulos) {
			total += c.getPaginas();
		}
		return total;
	}
	
	public boolean contieneCapitulo(Capitulo c) {
		return listaCapitulos.contains(c);
	}
	
	public boolean cambiarCapitulo(Capitulo viejo, Capitulo nuevo) {
		int posicion = listaCapitulos.indexOf(viejo);
		listaCapitulos.set(posicion, nuevo);
		return posicion != -1;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public List<Capitulo> getListaCapitulos() {
		return listaCapitulos;
	}

}
