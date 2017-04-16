package app.cliente;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.modelo.Autor;
import app.modelo.Direccion;
import app.modelo.Editorial;
import app.modelo.Libro;
import app.negocio.ItfzGestionLibreria;


/**
 * @author Eva Fonseca López
 *
 */
public class TestLibreria {
	
	public static void main(String[] args) {
				
			ApplicationContext contenedor = new ClassPathXmlApplicationContext("spring.xml");
			
			ItfzGestionLibreria beanNegocio = (ItfzGestionLibreria) contenedor.getBean("negocio");
			
			Autor autorUno = new Autor("NombreUno","EspañolaUno","ComentariosUnos");
			Autor autorDos = new Autor("NombreDos","EspañolaDos","ComentariosDos");
		
			Direccion direccionUno = new Direccion("CalleUno",1,"Madrid",2801,"Madrid");
			Direccion direccionDos = new Direccion("CalleDos",2,"Madrid",2802,"Madrid");
			
			Editorial editorialUno = new Editorial("EditorialUno",direccionUno,"123456");
			Editorial editorialDos = new Editorial("EditorialDos",direccionDos,"123456789");
			
			Libro libroUno = new Libro("TituloUno","8888",2010,20.0,"DescripcionUno");
			libroUno.addAutor(autorUno);
			libroUno.setEditorial(editorialUno);
			beanNegocio.altaLibro(libroUno);
			Libro libroDos = new Libro("TituloDos","5555",2012,20.0,"DescripcionDos");
			libroDos.addAutor(autorDos);
			libroDos.setEditorial(editorialDos);
			beanNegocio.altaLibro(libroDos);
			
			//consultar todos los libros
			List<Libro> libros = beanNegocio.consultarTodos();
//			for(Libro l:libros){
//				System.out.println(l);
//			}
			//Consultar libro por isbn
			List<Libro> librosIsbn = beanNegocio.consultarISBN("8888");
			System.out.println("El título del libro es:" + librosIsbn.get(0).getTitulo());
			System.out.println(librosIsbn);
			
			//Eliminar libro
			int del =beanNegocio.eliminarLibro("8888");
			if(del != 0){
				System.out.println("Se ha eliminado: "+ del + " libros");
			}
			
			//Modificar precio
			int updateEntities = beanNegocio.modificarPrecio("5555", 40.0);
			if(updateEntities != 0){
				System.out.println("Se ha actualizado el precio de: "+ updateEntities + " libros");
			}

		}
}
