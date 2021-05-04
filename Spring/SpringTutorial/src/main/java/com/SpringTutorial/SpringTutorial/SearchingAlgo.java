	package com.SpringTutorial.SpringTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //Manage the beans -- Object managed by Spring IoC 
public class SearchingAlgo {
	//Sorting an array
	//search an array
	//return the result
	
	//@Autowired //what are the dependencies between the beans
	private SortAlgorithm sortAlgo;
	
	
	@Autowired 
	public void setter(SortAlgorithm sort)
	{
		this.sortAlgo = sort;
	}
	
	
	
	/*
	 * public SearchingAlgo(SortAlgorithm sortAlgo) { super(); this.sortAlgo =
	 * sortAlgo; }
	 */

	public int[] binarySearch(int nums[])
	{
		//BubbleSortAlgo bubble = new BubbleSortAlgo();
		int results[] = sortAlgo.sort(nums);
		//System.out.println("Using Bubble Sort");
		//System.out.println(results);
		
		return results;
	}
}
