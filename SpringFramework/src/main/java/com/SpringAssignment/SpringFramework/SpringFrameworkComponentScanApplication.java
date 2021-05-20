package com.SpringAssignment.SpringFramework;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.SpringAssignment.SpringFramework.Basic.SearchImpl;
import com.SpringAssignment.SpringFramework.Scope.PersonDAO;
import com.Component.scan.ComponentPersonDAO;

@SpringBootApplication
@ComponentScan("com.Component.scan")

public class SpringFrameworkComponentScanApplication {

	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringFrameworkComponentScanApplication.class);
	
	public static void main(String[] args) {
		
		//SearchImpl search = new SearchImpl(new Quick());
		
		
		//ApplicationContext manages the beans
		ApplicationContext applicationContext = 
						SpringApplication.run(SpringFrameworkComponentScanApplication.class, args);
		
		ComponentPersonDAO componentPerson1 = applicationContext.getBean(ComponentPersonDAO.class); //Getting the Bean Binary from the application context
		
		
		LOGGER.info("{}", componentPerson1);

		
	}

}
