package app.modelo;

import java.io.Serializable;
import java.util.Set;

public class Editorial implements Serializable{

	private static final long serialVersionUID = -8675817140615957315L;
	private long id;
	private String nombre;
	private Direccion direccion;
	private String nif;
	private Set<Libro> libros;
	
	public Editorial(){
		
	}

	public Editorial(String nombre, Direccion direccion, String nif) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.nif = nif;
	}

	public long getIdEditorial() {
		return id;
	}
	public void setIdEditorial(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public Set<Libro> getLibros() {
		return libros;
	}
	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}
	
	public void addLibro(Libro libro){
		libros.add(libro);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
