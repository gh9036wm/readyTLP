package com.minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

//import static org.junit.Assert.*;

import org.junit.Test;

import com.in28minutes.mockito.mockitodemo.DataService;
import com.in28minutes.mockito.mockitodemo.SomeBusinessImpl;

public class SomeBusinessStubTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		DataServiceStub datastub = new DataServiceStub();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(datastub);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25,result);
		
	}

}

// implement interface data service
class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		int[] array = {25,5,15};
		return array;
	}}