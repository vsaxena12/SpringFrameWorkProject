package com.SpringAssignment.SpringFramework.Basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Qualifier("bubble")

public class Bubble implements SortAlgorithm{
	public int[] sortAlgo(int[] numbers)	
	{
		int temp = 0;
		
		for(int i=0; i<numbers.length; i++)
		{
			for(int j=i+1; j<numbers.length; j++)
			{
				if(numbers[i]>numbers[j])
				{
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println("\nBubble Sort");
		
		return numbers;
	}
}
