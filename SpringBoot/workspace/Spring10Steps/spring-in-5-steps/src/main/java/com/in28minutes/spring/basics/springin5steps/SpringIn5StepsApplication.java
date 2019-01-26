package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarysearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//int result =binarysearch.BinarySearch(new int[] {12,4,6}, 3);
	//	System.out.println(result);
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarysearch = applicationContext.getBean(BinarySearchImpl.class);
	int result = binarysearch.BinarySearch(new int[] {12,4,6}, 3);
	System.out.println(result);
	}

}

