package br.edu.univas.si5.bdii.aula1;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd2.model.entities.City;
import br.edu.univas.bd2.util.HibernateUtil;

public class Test51 {

	@Test
	public void test() {
		EntityManager em = HibernateUtil.getEntityManager();
		City vr = em.find(City.class, 12);
		City pa = em.find(City.class, 13);
		
		System.out.println(vr.getName() + " UF: " + vr.getState().getSigla());
		System.out.println(pa.getName() + " UF: " + pa.getState().getSigla());
		
		City cm = em.find(City.class, 10);
		System.out.println(cm.getName() + " UF: " + cm.getState().getSigla());
		
		
	}
}