package com.xworkz.javaprogram.Aptiprograms2;
/*
 *    * * * * *
 *      *   *
 *        *
 *      *   *
 *    * * * * *
 */
public class PatternSquare6 {
	
public static void main(String[] args) {
		
		int Lines = 5;
		for (int i=0; i<Lines; i++) {
			for (int j=0; j<Lines; j++) {
			if( i==0 || i==Lines-1 || i==j || i+j==Lines-1)
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
