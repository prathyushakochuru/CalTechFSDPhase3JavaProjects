package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.dao.LearnerDAO;
import com.app.model.Learner;

public class SpringHibernateMain {

	public static void main(String[] args) {
		

		ApplicationContext context= new ClassPathXmlApplicationContext("spring-hibernate-beans.xml");
		LearnerDAO dao = (LearnerDAO)context.getBean("dao");
		
		Learner l1 = new Learner("Aarush", "NJ, USA");
		
		System.out.println(dao.addLearner(l1));
		
		System.out.println(dao.getAllLearners());
		
		System.out.println(dao.getLeanerbyId(3));
		
		

	}

}
