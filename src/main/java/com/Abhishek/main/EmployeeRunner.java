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
		
		
		// HQL to get all the records
		//Query query=session.createQuery("from Employee",Employee.class);
//	     List list=((org.hibernate.query.Query<Employee>) query).list();  
//	      System.out.println(list);
		
		//HQL to get records with pagination
		
//		query.setFirstResult(2);
//		query.setMaxResults(5);
//		System.out.println(((org.hibernate.query.Query<Employee>) query).list());

		
//		Query q=session.createQuery("select max(name)from Employee");
//		List list =((org.hibernate.query.Query<Employee>) q).list();
//		System.out.println(list);
		
		
		//HQL update query
		
//		MutationQuery mutationQuery=session.createMutationQuery("update Employee set name=:n where id=:i");
//		mutationQuery.setParameter("n","Karan");
//		mutationQuery.setParameter("i",13);
//		System.out.println("status:"+mutationQuery.executeUpdate());
		
		
		
		//HQL delete query
		//Delete multiptes data from database also by implement multiple delete queries.
		
		MutationQuery mutationQuery=session.createMutationQuery("delete from Employee where id=20");
		mutationQuery.executeUpdate();
		
		MutationQuery mutationQuery1=session.createMutationQuery("delete from Employee where id=14");
		mutationQuery1.executeUpdate();
		
		
		
		
		
		
		
		
		//Return list of all records in the database(table)
//		Query query=session.createQuery("from Employee",Employee.class);
//		
//		List list=((org.hibernate.query.Query<Employee>) query).list();
//		System.out.println(list);
//		
		
		
		
		
	//	session.persist(emp);
		tn.commit();
		
		
		
		

		
		
	}

}

		
	
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	


