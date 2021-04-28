package com.app.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.dao.LearnerDAO;
import com.app.model.Learner;

public class LearnerDAOImpl implements LearnerDAO{
	
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public Learner addLearner(Learner learner) {
		Session session = factory.openSession();
		
		Transaction transc = session.beginTransaction();
		session.save(learner);
		transc.commit();
		session.close();
		return learner;
	}

	@Override
	public Learner getLeanerbyId(int id) {
		Session session = factory.openSession();
		Transaction transc = session.beginTransaction();
		Learner l1 = (Learner) session.get(Learner.class, id);
		transc.commit();
		session.close();
		return l1;
	}

	@Override
	public Learner updateLeaner(Learner learner) {
		Session session = factory.openSession();
		Transaction transc = session.beginTransaction();
		session.update(learner);
		transc.commit();
		session.close();
		return learner;
	}

	@Override
	public void deleteLearner(int id) {
		Session session = factory.openSession();
		Transaction transc = session.beginTransaction();
		
		Learner l1 = new Learner();
		l1.setId(id);
		session.delete(l1);
		transc.commit();
		session.close();
		
	}

	@Override
	public List<Learner> getAllLearners() {
		Session session = factory.openSession();
		Query query = session.createQuery("from com.app.model.Learner");
		List<Learner> learners = query.list();
		session.close();
		return learners;
	}

}
