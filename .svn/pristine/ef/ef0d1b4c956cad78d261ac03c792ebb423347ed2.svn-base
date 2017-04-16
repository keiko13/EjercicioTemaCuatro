package app.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.Proxy;

/**
 * @author Eva Fonseca López
 *
 */

public class Libro implements Serializable{
	
	private static final long serialVersionUID = -4091940771953456457L;
	private long id;
	private String titulo;
	private String isbn;
	private int publicacion;
	private double precio;
	private String descripcion;
	private Editorial editorial;
	private Set<Autor> autores;
	
	public Libro(){
		
	}

	public Libro(String titulo, String isbn, int publicacion,
			double precio, String descripcion) {
		
		this.titulo = titulo;
		this.isbn = isbn;
		this.publicacion = publicacion;
		this.precio = precio;
		this.descripcion = descripcion;
		autores = new HashSet<Autor>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(int publicacion) {
		this.publicacion = publicacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}
	
	public void addAutor(Autor autor) {
		autores.add(autor);
		autor.addlibro(this);
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", isbn=" + isbn
				+ ", publicacion=" + publicacion + ", precio=" + precio
				+ ", descripcion=" + descripcion + ", editorial=" + editorial
				+ ", autores=" + autores + "]";
	}	
}
