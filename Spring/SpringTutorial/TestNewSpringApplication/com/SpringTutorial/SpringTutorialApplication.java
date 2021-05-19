package com.SpringTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		
		
		//ApplicationContext manages the beans
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringTutorialApplication.class, args);
		
	}

}
