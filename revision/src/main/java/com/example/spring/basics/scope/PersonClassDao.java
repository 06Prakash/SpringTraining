package com.example.spring.basics.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PersonClassDao {
	
	@Autowired
	private JdbcClassTemplate jdbcClassTemplate;

	public JdbcClassTemplate getJdbcClassTemplate() {
		return jdbcClassTemplate;
	}

	public void setJdbcClassTemplate(JdbcClassTemplate jdbcClassTemplate) {
		this.jdbcClassTemplate = jdbcClassTemplate;
	}
	
	
}
