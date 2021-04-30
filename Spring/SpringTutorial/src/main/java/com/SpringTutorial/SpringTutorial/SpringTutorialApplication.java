package com.SpringTutorial.SpringTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext applicaitonContext = 
				SpringApplication.run(SpringTutorialApplication.class, args);
		
		//SearchingAlgo search = new SearchingAlgo(new SelectionSortAlgo());
		
		SearchingAlgo search = applicaitonContext.getBean(SearchingAlgo.class);
		
		int result[] = search.binarySearch(new int[] {12,4,6,5,3});
		
		for(int resultSearch: result) 
		{
			System.out.println(resultSearch);
		}
	}

}
