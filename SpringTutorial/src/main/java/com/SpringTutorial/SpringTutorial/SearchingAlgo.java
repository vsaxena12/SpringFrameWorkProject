package com.SpringTutorial.SpringTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchingAlgo {
	//Sorting an array
	//search an array
	//return the result
	
	@Autowired
	private SortAlgorithm sortAlgo;
	
	
	public SearchingAlgo(SortAlgorithm sortAlgo)
	{
		//super();
		this.sortAlgo = sortAlgo;
	}

	public int[] binarySearch(int nums[])
	{
		//BubbleSortAlgo bubble = new BubbleSortAlgo();
		int results[] = sortAlgo.sort(nums);
		//System.out.println("Using Bubble Sort");
		//System.out.println(results);
		
		return results;
	}
}
