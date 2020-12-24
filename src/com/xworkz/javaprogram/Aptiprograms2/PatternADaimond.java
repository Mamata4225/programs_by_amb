package com.xworkz.javaprogram.Aptiprograms2;
/*
 *         *
 *        * *
 *       *   *
 *      *     *
 *       *   *
 *        * *
 *         *  
 */

public class PatternADaimond {
	
	public static void main(String[] args) {
   	 int noOfLines = 7;
   	 int mid = noOfLines/2;
   	 int space= mid;
   	 
   	for(int i=0; i<noOfLines; i++) {
		for(int j=0; j<space; j++) {
		 
			System.out.print(" ");
     	}
		for (int k=mid-space+1; k>0; k--) {
			if(k==1 || k==mid-space+1)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		if(i<mid)
		space--;
		else
		space++;
            System.out.println();
   		}
	}
}
