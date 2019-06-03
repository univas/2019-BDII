package br.edu.univas.si5.bdii.aula1;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Test;

import br.edu.univas.bd2.model.entities.State;
import br.edu.univas.bd2.util.HibernateUtil;

public class Test71 {

	@Test
	public void test() {
		EntityManager em = HibernateUtil.getEntityManager();
		
		//sigla_filtro é o "nome" do parâmetro
		//sigla_filtro está no lugar da interrogação no JDBC
		String ql = "select s from State s where sigla = :sigla_filtro";
		TypedQuery<State> query = em.createQuery(ql, State.class);
		query.setParameter("sigla_filtro", "RJ");//configura o filtro

		//traz a lista de objetos
		//List<State> estados = query.getResultList();
		
		//traz apenas 1 objeto. OBS: se houver mais de 1 objeto, dá erro
		State estado = query.getSingleResult();
		System.out.println("Estado: " + estado.getNome());
		
		System.out.println(estado.getCities());
		
		
	}

}
