package models;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class TestHibernate {
	private Session session;
	
	public TestHibernate(){
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		System.out.println("config");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		session = sessionFactory.openSession();
	}
	
	
	public List<Pays> cherchePays(){
		Criteria criteria = session.createCriteria(Pays.class);
		return criteria.list();
	}
	
	public List<Pays> cherchePaysHQL(){
		Query query = session.createQuery("from Pays");
		return query.list();
	}
	
	public List<Film> chercheFilms(){
		Criteria criteria = session.createCriteria(Film.class);
		return criteria.list();
	}
	
	public void insertPays(Pays pays){
		session.beginTransaction();
		session.save(pays);
		session.getTransaction().commit();
	}
	
	

}
