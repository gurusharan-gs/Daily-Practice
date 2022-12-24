package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String insertEmp(Employee employee) {

		String message = "invailid details";
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		
		em.close();
		
		return message;
	
		
	}

}
