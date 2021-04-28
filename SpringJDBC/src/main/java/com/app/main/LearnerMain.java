package com.app.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.dao.*;
import com.app.model.*;

public class LearnerMain {

	public static void main(String[] args) {
		

		ApplicationContext context=new ClassPathXmlApplicationContext("jdbcBean.xml");
		Learner l1 =new Learner();
		l1.setLearnername("Harsha");
		l1.setAddress("NY, USA");
		
		LearnerDAO dao = (LearnerDAO) context.getBean("LeanerDAO");
		
		System.out.println(dao.addLearner(l1));
		
		System.out.println(dao.getLeanerbyId(2));
		dao.deleteLearner(1);
		
		List<Learner> llist = dao.getAllLearners();
		System.out.println("\n\nTotal "+llist.size()+" no of learners in DB. Printing their details : ");
		for(Learner p:llist) {
			System.out.println(p);
		}
		

	}

}
