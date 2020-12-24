package com.xworkz.javaprogram.Assignment;
	import java.util.Arrays;   
	public class SortArray {  
	
	public static void main(String[] args) {   
	     
	int [] array = new int [] {11, 25, 8,69,32,2,30,96};  
	
	Arrays.sort(array);   
	System.out.println("Elements of sorted array :");  
 
	for (int i = 0; i < array.length; i++)   
	{       
	System.out.print(array[i]+ " ");   
	  }   
   } 
}
