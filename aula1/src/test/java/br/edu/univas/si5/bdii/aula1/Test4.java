package br.edu.univas.si5.bdii.aula1;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd2.model.entities.City;
import br.edu.univas.bd2.model.entities.State;
import br.edu.univas.bd2.util.HibernateUtil;

public class Test4 {

	@Test
	public void test() {
		EntityManager em = HibernateUtil.getEntityManager();
		State mg = em.find(State.class, 1);
		System.out.println(mg.getNome());

		City vr = new City();
		vr.setIbge(12);
		vr.setArea(345);
		vr.setName("Volta Redonda");
		vr.setState(mg);

		City pa = new City();
		pa.setIbge(13);
		pa.setArea(456);
		pa.setName("Paraty");
		pa.setState(mg);

		State rj = new State();
		rj.setIbge(2);
		rj.setNome("Rio de Janeiro");
		rj.setArea(3456);
		rj.setSigla("RJ");

		em.getTransaction().begin();
		em.persist(vr);
		em.persist(pa);
		em.persist(rj);
		em.getTransaction().commit();
	}

}
