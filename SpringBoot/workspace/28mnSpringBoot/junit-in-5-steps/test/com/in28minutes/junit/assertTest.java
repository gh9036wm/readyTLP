package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class assertTest {

	@Test
	public void test() {
		int result = 1;
		boolean cond = true;
		assertEquals(1,result);// expect 1 , result should be 1
		assertEquals(true,cond);
		// or we can do
		assertTrue(cond);
		assertFalse(false);
		
	}

}
