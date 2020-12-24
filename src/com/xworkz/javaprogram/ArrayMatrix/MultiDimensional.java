package com.xworkz.javaprogram.ArrayMatrix;

public class MultiDimensional {
public static void main(String[] args) {
	int num = 100;
	int [][]arr = new int[3][3];
	


	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			arr[i][j] = num;
			num++;
	}
}
	System.out.println("The element of array is : ");
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr.length; j++) {

		System.out.print(arr[i][j]+ " ");
		}
	

	}
}
}
