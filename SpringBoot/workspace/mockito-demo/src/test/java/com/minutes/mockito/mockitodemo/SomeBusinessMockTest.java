package com.minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

//import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.in28minutes.mockito.mockitodemo.DataService;
//import com.in28minutes.mockito.mockitodemo.DataService;
import com.in28minutes.mockito.mockitodemo.SomeBusinessImpl;

public class SomeBusinessMockTest {
// To do mock we have to import 2 things above : import static ...mock and when
// making sure to create constructor of return data class(DataService) that passing into parameter of 
//the class you want to test ( SomebusinessImpl)
//use mock to test all value
	@Test
	public void testFindTheGreatestFromAllData() {
		DataService dataServiceMock = mock(DataService.class);
		//dataServiceMock.retrieveAllData() => int [] {24,15,3};
		when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {24,15,3});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24,result);
		}
	// or we can use mock to test just one value just copy and paste
	@Test
	public void testFindTheGreatestFromAllData_ForAllValue() {
		DataService dataServiceMock = mock(DataService.class);
		//dataServiceMock.retrieveAllData() => int [] {15};
		when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {15});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(15,result);
		}
	

}


