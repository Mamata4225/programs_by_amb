package com.xworkz.javaprogram.DEC12;
/*
 *             s
 *           s u h
 *         s u h e l
 *           s u h
 *             s
 */
public class AlphaPatternSuhel {

	public static void main(String[] args) { 
	   	int noOfLines = 5;
		int mid = noOfLines/2;
		int space = mid;
		int letters = 1;
		
		for(int i=0; i<noOfLines; i++) {
		for(int j=0; j<space; j++) {
			System.out.print(" ");
		}
		char kValue = 's';
		for (int k=0; k<letters; k++) {
			System.out.print(kValue);
			if(k<letters)
				kValue++;
			else
				kValue--;
			}
		
		if(i<mid) {
			space--;
			letters = letters+2;
			}
		else {
			space++;
			letters = letters-2;
			}
		System.out.println();
	}
	}
}
