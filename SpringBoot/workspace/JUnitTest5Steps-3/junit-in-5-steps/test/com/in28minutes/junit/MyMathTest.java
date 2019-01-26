package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

	@Test
	public void Sum_with3Numbers() {
		int[] numbers = {3,5,2};
		MyMath mymath = new MyMath();
		int result = mymath.sum(numbers);
		
	// to check if expect will match with result: assertEquals(expected, actual)
		   assertEquals(10, result);
		   assertEquals(1,1);
		   assertEquals(true, true);//assertEquals(expectCondition, actualCondition);
		   assertTrue(true);
		   assertEquals(false,false);
		   assertFalse(false);
		
		
		
		//System.out.println(result);
		
	}

}
