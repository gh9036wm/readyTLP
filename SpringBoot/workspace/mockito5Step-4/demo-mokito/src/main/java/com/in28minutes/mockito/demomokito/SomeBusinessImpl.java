package com.in28minutes.mockito.demomokito;

public class SomeBusinessImpl {
	private DataService dataservice;
	
	public SomeBusinessImpl(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}

	int  findTheGreatestFromAllData() {
		 int [] data = dataservice.retrieveAllData();
		 int greatest = Integer.MIN_VALUE;
		 for(int value: data) {
			 if (value> greatest) {
				 greatest = value;
			 }
			 
		 }
		return greatest;
	}

	
	
}
