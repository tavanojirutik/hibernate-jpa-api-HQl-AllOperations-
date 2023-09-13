package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Rutik");
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		Employee e= entityManager.find(Employee.class,1);
		e.setEmail("aryantavanoji@gmail.com");   //Update Command is Run // Value is can update 
		 
		entityTransaction.begin();
		entityManager.merge(e);
		entityTransaction.commit();
		
		System.out.println(e.getEmail());
		
	}

}
