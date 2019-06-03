package br.edu.univas.si5.bdii.aula1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Test;

import br.edu.univas.bd2.model.entities.City;
import br.edu.univas.bd2.util.HibernateUtil;

public class Test72 {

	@Test
	public void test() {
		EntityManager em = HibernateUtil.getEntityManager();
		
		String ql = "select c from City c where c.state.sigla = :sigla_param";
		TypedQuery<City> query = em.createQuery(ql, City.class);
		query.setParameter("sigla_param", "MG");
		
		//traz a lista de objetos
		List<City> cidades = query.getResultList();
		
		for (City city : cidades) {
			System.out.println(city.getName());
		}
	}
}
