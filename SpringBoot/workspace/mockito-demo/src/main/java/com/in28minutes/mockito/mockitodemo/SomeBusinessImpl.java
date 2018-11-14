package com.in28minutes.mockito.mockitodemo;

public class SomeBusinessImpl {
	private DataService dataservice ;
	
	public SomeBusinessImpl(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}

	public int findTheGreatestFromAllData() {
		int [] data =dataservice.retrieveAllData();
		int theGreatest = Integer.MIN_VALUE;
		for(int value: data) {
			if(value > theGreatest) {
				theGreatest= value;
			}
			
		}
		return theGreatest;
	}

}
 