package com.minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

//import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.mockito.Mockito.when;
import com.in28minutes.mockito.mockitodemo.DataService;
import com.in28minutes.mockito.mockitodemo.SomeBusinessImpl;

//Anytime using @Mock and @InjectMocks we have to add @RunWith(MockitoJUnitRunner.class) to get it worked
@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationTest {
	@Mock
	DataService dataServiceMock;
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	
	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {24,15,3});
		assertEquals(24,businessImpl.findTheGreatestFromAllData());
		}
	// or we can use mock to test just one value just copy and paste
	@Test
	public void testFindTheGreatestFromAllData_ForNOValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {});
		assertEquals(Integer.MIN_VALUE,businessImpl.findTheGreatestFromAllData());
		}
	

}


