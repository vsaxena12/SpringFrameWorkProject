package com.SpringAssignment.SpringFramework.Scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) 

public class PersonDAO {
	
	@Autowired
	JDBCConnect jdbc;

	public JDBCConnect getJdbc() {
		return jdbc;
	}

	public void setJdbc(JDBCConnect jdbc) {
		this.jdbc = jdbc;
	}
	
	

}
