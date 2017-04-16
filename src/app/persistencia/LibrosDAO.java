package app.persistencia;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import app.modelo.Libro;


/**
 * @author Eva Fonseca López
 *
 */

public class LibrosDAO implements ItfzLibrosDao  {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public int eliminarLibro(String isbn) {
		Session session = sessionFactory.openSession();
		String hql = "DELETE FROM Libro "  + 
	             "WHERE isbn = :isbn";
		Query query = session.createQuery(hql);
		query.setParameter("isbn", isbn);
		int result = query.executeUpdate();
		return result;
	}

	@Override
	public List<Libro> consultarTodos() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Libro.class);
		List<Libro> libros = (List<Libro>)criteria.list();
		session.getTransaction().commit();
		
		return libros;
	}

	@Override
	public List<Libro> consultarISBN(String isbn) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Libro.class)
			    .add( Restrictions.eq("isbn", isbn));
		List<Libro> libro = criteria.list();
		
		return libro;
	}

	@Override
	public List<Libro> consultarTitulo(String titulo) throws LibroNoEncontradoException{
		
		return null;
	}

	@Override
	public int modificarPrecio(String isbn, double precio) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		String hqlUpdate = "update Libro c set c.precio = :precio where c.isbn = :isbn";

		int updatedEntities = session.createQuery( hqlUpdate )
		        .setDouble( "precio", precio )
		        .setString( "isbn", isbn )
		        .executeUpdate();
			tx.commit();
		
		return updatedEntities;
	}

	@Override
	public boolean altaLibro(Libro libro) {
		try{
			Session session = getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.save(libro);
			session.getTransaction().commit();
		}catch (Exception e) {
			return false;
		}
		return true;
	}

	

}
