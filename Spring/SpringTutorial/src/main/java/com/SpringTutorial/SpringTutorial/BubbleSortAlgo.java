package com.SpringTutorial.SpringTutorial;

import org.springframework.stereotype.Component;

/*
 * Bubble Sort uses O(n^2) time complexity
 */

@Component
public class BubbleSortAlgo implements SortAlgorithm {
	public int[] sort(int[] nums)
	{
		int temp = 0;
		
		for(int i=0; i<nums.length; i++)
		{
			for(int j=i+1; j<nums.length; j++)
			{
				if(nums[i]>nums[j])
				{
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("\nBubble Sort");
		return nums;
	}

}
