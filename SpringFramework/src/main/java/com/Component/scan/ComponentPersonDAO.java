package com.Component.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) 

public class ComponentPersonDAO {
	
	@Autowired
	JDBCConnectComponent jdbc;

	public JDBCConnectComponent getJdbc() {
		return jdbc;
	}

	public void setJdbc(JDBCConnectComponent jdbc) {
		this.jdbc = jdbc;
	}
	
	

}
