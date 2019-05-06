package br.edu.univas.bd2.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	private static final EntityManagerFactory emFactory = buildSessionFactory();

	private static EntityManagerFactory buildSessionFactory() {
		try {
			return Persistence.createEntityManagerFactory("AulaHibernate_PU"); // Create
		} catch (Throwable e) {
			// Log the exception , as it might be swallowed
			System.err.println(" Error creating EntityManagerFactory ." + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	// método que utilizaremos para obter o EntityManager

	public static EntityManager getEntityManager() {
		return emFactory.createEntityManager();
	}
}
