package app.negocio;

import java.util.List;

import app.modelo.Libro;
import app.persistencia.ItfzLibrosDao;
import app.persistencia.LibroNoEncontradoException;

/**
 * Interfaz de la fachada gestión librería
 * @author Eva Fonseca López
 *
 */
public interface ItfzGestionLibreria {
	
	public boolean altaLibro(Libro libro);
	public int eliminarLibro(String ISBN);
	public List<Libro> consultarTodos();
	public List<Libro> consultarISBN(String isbn);
	public List<Libro> consultarTitulo(String titulo) throws LibroNoEncontradoException;
	public int modificarPrecio(String isbn, double precio);

}
