package com.in28minutes.mockito.demomokito;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessImpTest {

	@Test
	public void testfindTheGreatestFromAllData() {
		DataServiceStub datastub = new DataServiceStub(); 
		SomeBusinessImpl business  = new SomeBusinessImpl(datastub);
		int result = business.findTheGreatestFromAllData();
		assertEquals(23,result);
	}

}
 class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		int [] alldata = {7,23,11};
		return alldata;
	}
	

 }