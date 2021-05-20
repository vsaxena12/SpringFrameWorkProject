package com.testClass;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTest {
	
	@Test
	public void test()
	{
		boolean condition = true;
		assertEquals(1,1);
		assertTrue(condition);
		assertFalse(condition);
		assertArrayEquals(new int[] {1}, new int[] {1});
	}

}
