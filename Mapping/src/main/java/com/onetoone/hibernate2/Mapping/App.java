package com.onetoone.hibernate2.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration();
		configuration.configure("hibernate2.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
	  session.beginTransaction();
	  
	  Student student=new Student();
	  student.setsName("meena");
	  
	  Laptop laptop=new Laptop();
	  laptop.setLaptop_Brand("apple");
	  
	  student.setLaptop(laptop);
	  laptop.setStudent(student);
	  
	  session.save(student);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		System.out.println("Record saved successfully.");

    }
}
