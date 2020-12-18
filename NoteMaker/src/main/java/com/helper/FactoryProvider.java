package com.helper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManagerFactory;

import org.hibernate.*;

//import com.mysql.cj.xdevapi.SessionFactory;
public class FactoryProvider {
	
	
 public  static  SessionFactory factory;
 
 
 public  static SessionFactory getFactory()
 {
	 
	 if(factory == null) {
		 
		 factory =  (SessionFactory) new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	 }
	 return  factory;
 }
 
 
 public void closeFactory() {
	 if(((EntityManagerFactory) factory).isOpen()==true) {
		 ((EntityManagerFactory) factory).close();
	 }
 }
}
