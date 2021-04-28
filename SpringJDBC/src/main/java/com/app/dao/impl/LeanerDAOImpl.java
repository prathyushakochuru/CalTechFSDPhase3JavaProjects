package com.app.dao.impl;

import com.app.model.Learner;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.app.dao.LearnerDAO;
import com.app.dao.mapper.*;

public class LeanerDAOImpl implements LearnerDAO{
	
	private JdbcTemplate template;
	private DataSource dataSource;
	
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template = new JdbcTemplate(this.dataSource);
	}
	@Override
	public Learner addLearner(Learner learner) {
		String strSQL = "INSERT INTO learners(learnername, address) VALUES(?,?)";
		template.update(strSQL, learner.getLearnername(), learner.getAddress());
		return learner;
	}
	@Override
	public Learner getLeanerbyId(int id) {
		String strSQL = "SELECT Id, learnername, address from learners WHERE Id = ?";
		Learner learner = template.queryForObject(strSQL, new Object[] {id}, new LeanerMapper());
		
		return learner;
	}
	@Override
	public Learner updateLeaner(Learner learner) {
		String strSQL = "UPDATE learners SET learnername = ? WHERE Id = 2";
		template.update(strSQL, learner.getLearnername());
		return learner;
	}
	@Override
	public void deleteLearner(int id) {
		String strSQL = "DELETE FROM learners WHERE Id = ?";
		template.update(strSQL, new Object[] {id} );
		System.out.println("Deleted id " + id);
		
	}
	@Override
	public List<Learner> getAllLearners() {
		String strSQL = "SELECT Id, learnername, address FROM learners";
		List<Learner> learnerlist = template.query(strSQL, new LeanerMapper());

		return learnerlist;
	}
	
	

}
