package com.xworkz.javaprogram.ArrayMatrix;

import java.util.Scanner;

public class AdditionMatrix {
public static void main(String[] args) {
	int i,j;
	int[][] arr = new int[3][3];
	int [][] arr1 = new int[3][3];
	
	
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter the elements of matrix1 : ");
	
	for(i=0; i<arr.length; i++) {
		for(j=0; j<arr.length; j++) {
			arr[i][j] = scan.nextInt();
			
		}
	}
	System.out.print("Enter the elements of matrix2 : ");
	for(i=0; i<arr.length; i++) {
		for(j=0; j<arr.length; j++) {
			arr1[i][j] = scan.nextInt();
			
		}
	}
	
	System.out.print("The Addition of Matrix1 and Matrix2 elements : ");
	int[][] result = new int[3][3];
	for(i=0; i<arr.length; i++) {
		for(j=0; j<arr.length; j++) {
			result[i][j] = arr[i][j]+arr1[i][j];
			System.out.println(result [i][j]);
			System.out.println();
		}
			
}
}

}
