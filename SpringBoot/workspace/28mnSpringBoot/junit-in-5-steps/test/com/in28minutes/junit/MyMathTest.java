package com.in28minutes.junit;



import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

	@Test
	public void sumWith3Number() {
		int[] array= {1,2,3};
		MyMath obj1Test = new MyMath();
		int result = obj1Test.sum(array);
		// check if result is 6
		assertEquals(6,result);
		
		
	}

}
