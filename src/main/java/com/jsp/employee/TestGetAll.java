package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import javax.persistence.Query;
import java.util.*;

public class TestGetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Rutik");
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		String sql = "SELECT e FROM Employee e";
		
		Query query= entityManager.createQuery(sql);
		
		
		List<Employee> emp= query.getResultList();
		
			for(Employee e : emp) {
				System.out.println("=================");
				System.out.println(e.getId());
				System.out.println(e.getName());
				System.out.println(e.getEmail());
				System.out.println(e.getPhno());
				System.out.println("=================");
			}
		
	}

}
