package br.edu.univas.si5.bdii.aula1;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd2.model.entities.City;
import br.edu.univas.bd2.model.entities.State;
import br.edu.univas.bd2.util.HibernateUtil;

public class Test3 {

	@Test
	public void test() {
		EntityManager em = HibernateUtil.getEntityManager();
		State mg = em.find(State.class, 1);
		System.out.println(mg.getNome());
		
		City cm = new City();
		cm.setIbge(10);
		cm.setArea(123);
		cm.setName("Cachoeira de Minas");
		cm.setState(mg);
		
		em.getTransaction().begin();
		em.persist(cm);
		em.getTransaction().commit();
		
		City pa = new City();
		pa.setIbge(11);
		pa.setArea(234);
		pa.setName("Pouso Alegre");
		pa.setState(mg);
		
		em.getTransaction().begin();
		em.persist(pa);
		em.getTransaction().commit();
	}

}
