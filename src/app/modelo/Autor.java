package app.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Autor implements Serializable{
	
	
	private static final long serialVersionUID = -6848000880451961276L;
	private long id;
	private String nombre;
	private String nacionalidad;
	private String comentarios;
	private Set<Libro> libros = new HashSet<Libro>();
	
	public Autor(){
			
	}

	public Autor(String nombre, String nacionalidad,String comentarios) {

		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.comentarios = comentarios;
		libros = new HashSet<Libro>();	
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}

	public void addlibro(Libro libro) {
		libros.add(libro);
		libro.getAutores().add(this);
	}

}
