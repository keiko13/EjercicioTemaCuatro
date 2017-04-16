package app.persistencia;

import java.util.List;

import app.modelo.Libro;

public interface ItfzLibrosDao{
	
	public boolean altaLibro(Libro libro);
	public int eliminarLibro(String isbn);
	public List<Libro> consultarTodos();
	public List<Libro> consultarISBN(String isbn);
	public List<Libro> consultarTitulo(String titulo) throws LibroNoEncontradoException;
	public int modificarPrecio(String isbn, double precio);


}
