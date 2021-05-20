package com.SpringAssignment.SpringFramework.Basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")

public class Quick implements SortAlgorithm {
	
	public int[] sortAlgo(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
		  
        // One by one move boundary of unsorted sub-array
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (nums[j] < nums[min_idx])
                    min_idx = j;
  
            // Swap the found minimum element with the first
            // element
            int temp = nums[min_idx];
            nums[min_idx] = nums[i];
            nums[i] = temp;
        }
        System.out.println("Selection Sort: ");
		return nums;
	}
}
