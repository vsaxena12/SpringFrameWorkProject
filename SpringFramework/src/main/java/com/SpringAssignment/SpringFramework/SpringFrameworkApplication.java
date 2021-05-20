package com.SpringAssignment.SpringFramework;

//import org.graalvm.compiler.graph.spi.Canonicalizable.Binary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringAssignment.SpringFramework.Basic.SearchImpl;

@SpringBootApplication
/*
 * Spring Boot @SpringBootApplication annotation is used to mark a configuration
 * class that declares one or more @Bean methods and also triggers
 * auto-configuration and component scanning. It’s same as declaring a class
 * with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations.
 */

public class SpringFrameworkApplication {

	public static void main(String[] args) {
		
		//SearchImpl search = new SearchImpl(new Quick());
		
		
		//ApplicationContext manages the beans
		ApplicationContext applicationContext = 
						SpringApplication.run(SpringFrameworkApplication.class, args);
		
		SearchImpl search1 = applicationContext.getBean(SearchImpl.class); //Getting the Bean Binary from the application context
		
		SearchImpl search2 = applicationContext.getBean(SearchImpl.class); //Getting the same bean - Singleton Bean
		
		
		SearchImpl search3 = applicationContext.getBean(SearchImpl.class);
		
		boolean findSearch = 
				search1.search(new int[] {4,5,6,7,1,2,3}, 10);
		System.out.println("Found the Search: "+findSearch);
		
		//System.out.println(search1);
		//System.out.println(search2);
		//System.out.println(search3);
		
		
	}

}
