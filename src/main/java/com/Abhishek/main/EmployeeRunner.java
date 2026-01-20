package com.Abhishek.main;





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
import com.Abhishek.entity.Employee;

import jakarta.persistence.Query;

public class EmployeeRunner {
	

	public static void main(String[] args)     {
		
		//Persistent object
		
		
	//	Employee emp=new Employee("Vipin","Male",98000,"India");
		
		
		//SessionFactory sessionFactory=EmpConfiguration.getSessionFactory();
		
		
		Session session=EmpConfiguration.getSessionFactory().openSession();
		
		
		Transaction tn=session.beginTransaction();
		
		

		
		
		
		
	MutationQuery namedQuery=session.createNamedMutationQuery("updateAnEmployee");
		namedQuery.setParameter("n","Abhi");
		namedQuery.setParameter("i",13);
		namedQuery.executeUpdate();
		
		
//		MutationQuery namedQuery=session.createNamedMutationQuery("deleteEmployeeById");
//		namedQuery.setParameter("i",10);
//		namedQuery.executeUpdate();
		
		
		
		
		
		
		tn.commit();
		
		Query query1=session.createQuery("from Employee",Employee.class);
		List list=((org.hibernate.query.Query<Employee>) query1).list();
		System.out.println(list);
		session.close();
	

		
		
	}

}

		
	
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	


