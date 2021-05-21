package com.SpringAssignmentMockito.SpringMockito;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

//import org.junit.Test;

class BusinessLayerTests {

	@Test
	public void testFindTheGreatest() {
		BusinessLayer business = new BusinessLayer(new DataServiceStub());
		int result = business.findTheGreatest();
		assertEquals(7, result);
	}
 
}


class DataServiceStub implements DataService
{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {4,6,7};
	}
	
}