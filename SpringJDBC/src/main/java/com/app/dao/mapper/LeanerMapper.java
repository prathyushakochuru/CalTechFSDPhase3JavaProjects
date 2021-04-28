package com.app.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.model.Learner;

public class LeanerMapper implements RowMapper<Learner>{

	@Override
	public Learner mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Learner learner = new Learner();
		learner.setId(rs.getInt("id"));
		learner.setLearnername(rs.getString("learnername"));
		learner.setAddress(rs.getString("address"));
		
		return learner;
	}

}
