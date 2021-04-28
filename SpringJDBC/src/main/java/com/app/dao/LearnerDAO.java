package com.app.dao;

import java.util.List;

import com.app.model.Learner;

public interface LearnerDAO {
	
	public Learner addLearner(Learner learner);
	public Learner getLeanerbyId(int id);
	public Learner updateLeaner(Learner learner);
	public void deleteLearner(int id);
	
	public List<Learner> getAllLearners();
	

}
