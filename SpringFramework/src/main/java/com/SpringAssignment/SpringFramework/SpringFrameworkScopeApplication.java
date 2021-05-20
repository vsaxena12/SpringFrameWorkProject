package com.SpringAssignment.SpringFramework;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringAssignment.SpringFramework.Basic.SearchImpl;
import com.SpringAssignment.SpringFramework.Scope.PersonDAO;

@SpringBootApplication
/*
 * Spring Boot @SpringBootApplication annotation is used to mark a configuration
 * class that declares one or more @Bean methods and also triggers
 * auto-configuration and component scanning. It’s same as declaring a class
 * with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations.
 */

public class SpringFrameworkScopeApplication {

	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringFrameworkScopeApplication.class);
	
	public static void main(String[] args) {
		
		//SearchImpl search = new SearchImpl(new Quick());
		
		
		//ApplicationContext manages the beans
		ApplicationContext applicationContext = 
						SpringApplication.run(SpringFrameworkScopeApplication.class, args);
		
		PersonDAO person1 = applicationContext.getBean(PersonDAO.class); //Getting the Bean Binary from the application context
		
		PersonDAO person2 = applicationContext.getBean(PersonDAO.class); //Getting the Bean Binary from the application context
		
		LOGGER.info("{}", person1);
		LOGGER.info("{}", person1.getJdbc());
		
		LOGGER.info("{}", person2);
		LOGGER.info("{}", person2.getJdbc());
		
	}

}
