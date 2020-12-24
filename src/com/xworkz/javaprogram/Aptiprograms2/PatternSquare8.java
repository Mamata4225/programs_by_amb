package com.xworkz.javaprogram.Aptiprograms2;
/*
 *    *     *     *
 *      *   *   *
 *        * * *
 *   *  * * * * * * *
 *        * * *
 *      *   *   *
 *    *     *     *
 * 
 */

public class PatternSquare8 {

	
public static void main(String[] args) {
		
		int Lines = 7;
		for (int i=0; i<Lines; i++) {
			for (int j=0; j<Lines; j++) {
			if( i==3 || j==3 || i==j || i+j==Lines-1 )
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
