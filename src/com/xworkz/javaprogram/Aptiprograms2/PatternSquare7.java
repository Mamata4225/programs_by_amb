package com.xworkz.javaprogram.Aptiprograms2;
/*
 *   *     *
 *   * * * * 
 *   *  *  *
 *   * * * *
 *   *     *
 */

public class PatternSquare7 {

public static void main(String[] args) {
		
		int Lines = 5;
		for (int i=0; i<Lines; i++) {
			for (int j=0; j<Lines; j++) {
			if( i+j==Lines-1 || j==0 || i==j || j==Lines-1 )
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
