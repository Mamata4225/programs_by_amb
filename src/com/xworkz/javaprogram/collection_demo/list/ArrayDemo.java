package com.xworkz.javaprogram.collection_demo.list;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayDemo {

public static void main(String[] args) {
	ArrayList al = new ArrayList();
	 
	al.add(1);
	al.add(2);
	al.add('a');
	al.add("hello");
	al.add(true);
 	
	

// or

for(int j=0; j<al.size(); j++) {
	System.out.println(al.get(j));   // for loop method
}


// or

for(Object o : al) {
	System.out.println(o);         // for Each method
}
}

}
