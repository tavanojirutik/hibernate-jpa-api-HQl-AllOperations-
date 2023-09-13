package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Rutik");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		
		Employee e= entityManager.find(Employee.class,2);  //This Method is Write a Query HQL Perform like 
		//where Condition Operation in Sql 
		
		System.out.println(e.getId());   //Print the All of Stuff by using SOP
		System.out.println(e.getName());
		System.out.println(e.getEmail());
		System.out.println(e.getPhno());
		
	}

}
