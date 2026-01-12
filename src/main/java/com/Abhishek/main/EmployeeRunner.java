package com.Abhishek.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.Abhishek.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args)     {
		
		//Persistent object
		
		Employee emp=new Employee(7,"Anshu","male",87000);
		
		
		//Deprecated
	//	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
	//	SessionFactory sessionFactory=cfg.buildSessionFactory();
	//	SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//NEW METHOD
		
	//	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure().build(); 
	//	Metadata metadata=new MetadataSources(ssr).getMetadataBuilder().build();
	//	SessionFactory sessionFactory=metadata.buildSessionFactory();
		
		
		
		//NEW METHOD THROUGH METHOD CHAINING
		SessionFactory sessionFactory=new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).getMetadataBuilder().build().buildSessionFactory();
		
		
		
		
		
		
		
		
		Session session=sessionFactory.openSession();
		
		
		Transaction tn=session.beginTransaction();
		
		
		//session.persist(emp);
		//tn.commit();
		
		
		
		//deprecated
		
		//Employee employee=session.get(Employee.class, 7);//it gives NULL
		//System.out.println(employee);
		
		
		Employee employee=session.find(Employee.class, 5);
		System.out.println(employee);
		
		
		
		
		//Employee employee=new Employee();
		//session.load( employee,7);//object not found exception
		
		//System.out.println(employee);
		
		
		

		
		
	}

}

		
	
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	


