package com.testClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.mainClass.MyMath;

class MyMathJunitTest {
	
	MyMath math = new MyMath();
	
	@Before
	public void before()
	{
		System.out.println("Before");
	}
	
	@After
	public void after()
	{
		System.out.println("After");
	}
	
	@Test
	void testONE() {
		fail("Not yet implemented");
		//System.out.println("Test1");
		//assertEquals(6, math.sum(new int[] {1,2,3}));
	}
	
	@Test
	void testTWO() {
		System.out.println("Test2");
		assertEquals(3, math.sum(new int[] {3}));
	}

	
}
