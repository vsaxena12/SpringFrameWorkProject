package com.SpringAssignment.SpringFramework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.graalvm.compiler.graph.spi.Canonicalizable.Binary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringAssignment.SpringFramework.Basic.SearchImpl;
import com.SpringAssignment.SpringFramework.CDI.CDIBussiness;

@SpringBootApplication

public class SpringFrameworkCDIApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkCDIApplication.class);

	public static void main(String[] args) {
		
		//SearchImpl search = new SearchImpl(new Quick());
		
		
		//ApplicationContext manages the beans
		ApplicationContext applicationContext = 
						SpringApplication.run(SpringFrameworkCDIApplication.class, args);
		
		CDIBussiness bussiness = applicationContext.getBean(CDIBussiness.class); //Getting the Bean Binary from the application context
		
		LOGGER.info("CDI Message Display");
		
	}

}
