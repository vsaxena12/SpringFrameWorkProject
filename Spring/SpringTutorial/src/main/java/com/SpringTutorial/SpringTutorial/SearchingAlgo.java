	package com.SpringTutorial.SpringTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //Manage the beans -- Object managed by Spring IoC 

public class SearchingAlgo {
	//Sorting an array
	//search an array
	//return the result
	
	@Autowired //what are the dependencies between the beans
	@Qualifier("selection")
	private SortAlgorithm BubbleSortAlgo;
	
	
	/*
	 * @Autowired public void setter(SortAlgorithm sort) { this.BubbleSortAlgo =
	 * sort; }
	 */
	
	
	
	/*
	 * public SearchingAlgo(SortAlgorithm sortAlgo) { super(); this.sortAlgo =
	 * sortAlgo; }
	 */

	public int[] binarySearch(int nums[])
	{
		//BubbleSortAlgo bubble = new BubbleSortAlgo();
		int results[] = BubbleSortAlgo.sort(nums);
		//System.out.println("Using Bubble Sort");
		//System.out.println(results);
		
		return results;
	}
}
