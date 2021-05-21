package com.SpringAssignmentMockito.SpringMockito;

public class BusinessLayer //implements DataService
{
	
	DataService service;
	
	
	
	public BusinessLayer(DataService service) {
		super();
		this.service = service;
	}



	public int findTheGreatest()
	{
		int[] data = service.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		for(int value: data)
		{
			if(value > greatest)
			{
				greatest = value;
			}
		}
		
		return greatest;
	}

}
