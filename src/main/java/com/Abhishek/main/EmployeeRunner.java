package com.Abhishek.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.Abhishek.config.EmpConfiguration;
import com.Abhishek.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args)     {
		
		//Persistent object
		
		
		Employee emp=new Employee("Aditya","Male",98000,"India");
		
		
		//SessionFactory sessionFactory=EmpConfiguration.getSessionFactory();
		
		
		Session session=EmpConfiguration.getSessionFactory().openSession();
		
		
		Transaction tn=session.beginTransaction();
		
		
		session.persist(emp);
		tn.commit();
		
		
		
		

		
		
	}

}

		
	
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	


