package com.cdac.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cdac.pojo.Contact;
import com.cdac.pojo.Employee;


public class AppMain {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setEmpid(1233);
		e1.setEmpname("Anil");
		
		Contact c1 = new Contact();
		c1.setEmailid("anil@gmail.com");
		c1.setMobileNum("3456782345");
		
		Contact c2 = new Contact();
		c2.setEmailid("anil.kishore@gmail.com");
		c2.setMobileNum("7894567898");
		
		Set<Contact> cset = new HashSet<>();
		cset.add(c1);
		cset.add(c2);
		
		e1.setContacts(cset);
		
		session.save(e1);
		
		transaction.commit();
		
		System.out.println("objects saved");
		
		sf.close();
	}
}








