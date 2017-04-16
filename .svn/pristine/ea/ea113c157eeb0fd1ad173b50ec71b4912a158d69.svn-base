package app.negocio;

import java.util.List;

import app.modelo.Libro;
import app.persistencia.LibroNoEncontradoException;
import app.persistencia.LibrosDAO;


/**
 * Clase fachada que gestiona la librería
 * @author Eva Fonseca López
 *
 */
public class GestionLibreria implements ItfzGestionLibreria{
	
	LibrosDAO librosDao;
	
	
	public GestionLibreria() {
		
	}

	public void setLibrosDao(LibrosDAO librosDao) {
		this.librosDao = librosDao;
	}

	public LibrosDAO getLibrosDao() {
		return librosDao;
	}

	@Override
	public boolean altaLibro(Libro libro) {
		
		boolean l = librosDao.altaLibro(libro);
		return l;
	}

	@Override
	public int eliminarLibro(String isbn) {
		int del = librosDao.eliminarLibro(isbn);
		return del;
	}

	@Override
	public List<Libro> consultarTodos() {
		List<Libro> libros = librosDao.consultarTodos();
		return libros;
	}

	@Override
	public List<Libro> consultarISBN(String isbn) {
		List<Libro> lib = librosDao.consultarISBN(isbn);
		return lib;
	}

	@Override
	public List<Libro> consultarTitulo(String titulo)
			throws LibroNoEncontradoException {
		return null;
	}

	@Override
	public int modificarPrecio(String isbn, double precio) {
		int updateEntities = librosDao.modificarPrecio(isbn, precio);
		return updateEntities;
	}

	
}
