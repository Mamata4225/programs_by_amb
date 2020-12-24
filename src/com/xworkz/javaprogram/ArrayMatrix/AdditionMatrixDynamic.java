package com.xworkz.javaprogram.ArrayMatrix;


import java.util.Scanner;

public class AdditionMatrixDynamic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row length ");
		int rowlength = s.nextInt();
		System.out.print("Enter the col length ");
		int collength = s.nextInt();
		
		
		int[][] arr = new int[rowlength][collength];
		int [][] arr1 = new int[rowlength][collength];
		
		
		

		System.out.print("Enter the elements of matrix1 : ");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = s.nextInt();
				
			}
		}
		System.out.print("Enter the elements of matrix2 : ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr1[i][j] = s.nextInt();
				
			}
		}
		
		System.out.print("The Addition of Matrix1 and Matrix2 elements : ");
		int[][] result = new int[rowlength][collength];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				result[i][j] = arr[i][j]+arr1[i][j];
				System.out.println(result [i][j]);
				System.out.println();
			}
				
	}
	}

	}

	
	

