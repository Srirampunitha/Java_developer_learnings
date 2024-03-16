package com.sriram.hibernate;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import com.sriram.entity.Userdetail;


public class App {

	public static void main(String[] args) {
	 org.hibernate.SessionFactory factory = new Configuration().
			 configure("hibernate.cfg.xml").
			 addAnnotatedClass(Userdetail.class).
			 buildSessionFactory();
	 Session session = factory.getCurrentSession();
	 try {
		 
		 //create entity object
		 Userdetail user = new Userdetail("Swetha", "Swetha@gmail.com");
		 //start transaction
		 session.beginTransaction();
		 //perform transaction
		 session.save(user);
		 //commit
		 session.getTransaction().commit();
		 System.out.println("app started");
		 
	 }finally {
		 session.close();
		 factory.close();
	 }
	}

}
