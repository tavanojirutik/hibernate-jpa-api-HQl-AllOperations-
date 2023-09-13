package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Rutik");
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		Employee e= entityManager.find(Employee.class,2); //its seam as a Priveus Statement if Condition Delete Condition execute 
		
		
		//Delete Loop Execute statement 
		if(e!=null){
			entityTransaction.begin();
			entityManager.remove(e);
			entityTransaction.commit();
		}else {
			System.out.println("Not Delete Statement");
		}
	}
}