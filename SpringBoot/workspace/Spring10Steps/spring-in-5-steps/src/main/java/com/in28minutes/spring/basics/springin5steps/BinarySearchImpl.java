package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortalgorithm;
	/**
	public BinarySearchImpl(SortAlgorithm sortalgorithm) {
		super();
		this.sortalgorithm = sortalgorithm;
	}
*/
	
	public int BinarySearch(int[] numbers, int numberSearchFor) {
		//implement sorting 
		//BubbleSortAlgorithm bubblesort = new BubbleSortAlgorithm();
		int [] sortedNumbers = sortalgorithm.sort(numbers);
		System.out.println(sortalgorithm);
		
		//Search array
		
		return 0;
	}

}
