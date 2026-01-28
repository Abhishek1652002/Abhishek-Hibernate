package com.Abhishek.main;





import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.Abhishek.config.EmpConfiguration;
import com.Abhishek.entity.Address;
import com.Abhishek.entity.Employee;

import jakarta.persistence.Query;

public class EmployeeRunner {
	

	public static void main(String[] args)     {
		
		//Persistent object
		
		
		Employee emp=new Employee("Anshu","Male",98000);
         
		Address add=new Address();
		add.setState("UP");
		add.setCity("GZB");
		
		Address add1=new Address();
		add.setState("UP");
		add.setCity("Noida");
		
		Address add2=new Address();
		add.setState("UP");
		add.setCity("Lucknow");
		
		ArrayList<Address>listOfAddresses=new ArrayList<>();
		listOfAddresses.add(add);
		listOfAddresses.add(add1);
		listOfAddresses.add(add2);
		
		
		
	    emp.setAddresses(listOfAddresses);
		
		
		
		
		
		
		
		//SessionFactory sessionFactory=EmpConfiguration.getSessionFactory();
		
		
		Session session=EmpConfiguration.getSessionFactory().openSession();
		
		
		Transaction tn=session.beginTransaction();
		
		session.persist(emp);
		session.persist(add);
		session.persist(add1);
		session.persist(add2);
		tn.commit();

		
	
		
	
	

		
		
	}

}

		
	
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	


