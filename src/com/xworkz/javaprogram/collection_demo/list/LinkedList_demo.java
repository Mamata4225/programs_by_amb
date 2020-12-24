package com.xworkz.javaprogram.collection_demo.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_demo {
public static void main(String[] args) {
	
	LinkedList ll = new LinkedList();
	
	ll.add('A');
	ll.add('B');
	ll.add('C');
	ll.add('D');
	
	ListIterator litr = ll.listIterator();
	
	while(litr.hasNext()) {
		System.out.println(litr.next());
	}
}
}
