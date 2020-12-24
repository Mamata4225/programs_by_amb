package com.xworkz.javaprogram.Assignment;
import java.util.Arrays;
public class CancatenationArray {

	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {6,7,8,9};
		
		int aLength = array1.length;
		int bLength = array2.length;
		
		int[] result = new int [aLength + bLength];
		
		System.arraycopy(array1, 0, result, 0,  aLength);
		System.arraycopy(array2, 0, result, aLength,  bLength);
		
		System.out.println(Arrays.toString(result));
	
	}
}
