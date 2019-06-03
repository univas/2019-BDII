package br.edu.univas.si5.bdii.aula1;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd2.model.entities.City;
import br.edu.univas.bd2.model.entities.State;
import br.edu.univas.bd2.util.HibernateUtil;

public class Test52 {

	@Test
	public void test() {
		EntityManager em = HibernateUtil.getEntityManager();
		State mg = em.find(State.class, 1);// busca o estado MG
		System.out.println(" UF: " + mg.getSigla());			
		
		for (City cidade : mg.getCities()) {
			System.out.println("Cidade: " + cidade.getName() + " UF: " + cidade.getState().getSigla());			
		}
	}
}