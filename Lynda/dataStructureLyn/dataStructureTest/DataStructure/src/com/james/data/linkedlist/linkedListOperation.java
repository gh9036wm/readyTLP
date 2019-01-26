package com.james.data.linkedlist;

import java.util.LinkedList;

public class linkedListOperation {
	public void addAndDelete() {
	LinkedList<String> ll = new LinkedList<>();
    
    ll.add("F");
    ll.add("B");
    ll.add("D");
    ll.add("E");
    ll.add("C");
  System.out.println("The original content of linkedlist is: " + ll);
  
  //add an element to the first position, to the given index position and  to the last position:
  ll.addFirst("James Tran");
  ll.addLast("Thao Nguyen");
  ll.add(2,"Raymon Nguyen" );
  
  System.out.print("The list after modifying: " + ll);
	}



}
