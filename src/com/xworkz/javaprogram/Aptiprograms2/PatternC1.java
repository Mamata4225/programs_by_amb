package com.xworkz.javaprogram.Aptiprograms2;
/*
 *      *
 *     * *
 *    * * *
 *   * * * *
 *  * * * * *  
 */
public class PatternC1 {
	public static void main(String[] args) {
		int noOfLines = 5;
		int space = noOfLines-1;
		
		for(int i=0; i<noOfLines; i++) {
			for(int j=0; j<space; j++) {
			   System.out.print(" ");
	     	}
			for (int k=noOfLines-space; k>0; k--) {
				System.out.print("* ");
				
			}
			space--;
	            System.out.println();
	}
  }
}




