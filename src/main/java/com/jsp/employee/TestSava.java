package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Rutik");
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		Employee e=new Employee();
		e.setEmail("vishal@gmail.com");
		e.setName("Vishal");
		e.setPhno(80942325567l);
		
		entityTransaction.begin();
		entityManager.persist(e);
		entityTransaction.commit();
		
	}

}
