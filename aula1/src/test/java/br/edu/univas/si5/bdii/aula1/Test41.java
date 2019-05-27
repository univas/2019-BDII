package br.edu.univas.si5.bdii.aula1;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd2.model.entities.City;
import br.edu.univas.bd2.model.entities.State;
import br.edu.univas.bd2.util.HibernateUtil;

public class Test41 {

	@Test
	public void test() {
		EntityManager em = HibernateUtil.getEntityManager();

		State rj = em.find(State.class, 2);// busca o estado RJ
		System.out.println(rj.getNome());

		City vr = em.find(City.class, 12); //busca a cidade Volta Redonda
		System.out.println(vr.getName());
		vr.setState(rj); //atualiza o objeto estado

		City pa = em.find(City.class, 13); //busca a cidade Paraty
		System.out.println(pa.getName());
		pa.setState(rj); //atualiza o objeto estado

		em.getTransaction().begin();
		//persiste as 2 cidades
		em.merge(vr); 
		em.merge(pa);
		em.getTransaction().commit();
	}
}