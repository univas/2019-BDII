package br.edu.univas.si5.bdii.aula1;

import java.lang.reflect.Field;

import javax.persistence.EntityManager;

import br.edu.univas.bd2.model.entities.Cargo;
import br.edu.univas.bd2.model.entities.State;
import br.edu.univas.bd2.util.HibernateUtil;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	public void testEstado() {
		
		System.out.println("Olá...");
		System.err.println("Boa noite...");
		Exception ex = new Exception("Teste exception");
		System.out.println(ex);
		
		State mg = new State();
		mg.setIbge(1);
		mg.setNome("Minas Gerais");
		mg.setArea(2345);
		mg.setSigla("MG");

		EntityManager em = HibernateUtil.getEntityManager();

		em.getTransaction().begin();
		em.persist(mg);
		em.getTransaction().commit();
	}
	
	public void testReflexao() {
		for (Field field : State.class.getDeclaredFields()) {
			System.out.println(field.getName());
		}
	}
	
	public void testCargo() {
		Cargo gerente = new Cargo();
		gerente.setNome("Gerente");
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(gerente);
		em.getTransaction().commit();
		
		System.out.println(gerente.getCodigo());
	}
}
