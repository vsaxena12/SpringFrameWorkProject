package com.SpringAssignment.SpringFramework.Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //Different Beans 
public class SearchImpl {
	
	//Sorted Array
	//Search the element
	
	@Autowired //Same as setter injection
	@Qualifier("quick")
	private SortAlgorithm sort; //SearchImpl is dependent on SortAlgorithm
	
	//Using Constructor --> @Autowired is not mandatory --> Used for Mandatory dependency
	/*
	 * public SearchImpl(SortAlgorithm sort) { super(); this.sort = sort; }
	 */

	//Using Setter injection --> @Autowired is required -->  Used for Non-Mandatory dependency
	/*
	 * public void setSort(SortAlgorithm sort) { this.sort = sort; }
	 */


	public boolean search(int[] numbers, int num)
	{
		
		int[] sorted = sort.sortAlgo(numbers);
		
		for(int n: sorted)
		{
			System.out.println(n);
		}
		
		for(int i=0; i<sorted.length; i++)
		{
			if(sorted[i] == num)
				return true;
		}
		
		return false;
		
	}

}
