package com.xworkz.javaprogram.Aptiprograms2;
/*
 *    * * * * *
 *    *       *
 *    *       *
 *    *       *
 *    * * * * *
 */

public class PatternSquare1 {
	
	public static void main(String[] args) {
		
		int Lines = 4;
		for (int i=0; i<Lines; i++) {
			for (int j=0; j<Lines; j++) {
			if(i==0 || i==3 || j==0 || j==3)
			{
				System.out.print(" * ");
			}
			else {
				System.out.print("   ");
			}
		}
		System.out.println();
	}
  }
}
