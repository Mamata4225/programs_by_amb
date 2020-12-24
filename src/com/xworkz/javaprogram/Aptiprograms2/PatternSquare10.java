package com.xworkz.javaprogram.Aptiprograms2;
/*    
 *      * * * * * * *
 *      * *   *   * *
 *      *   * * *   *
 *      * * * * * * *
 *      *   * * *   *
 *      * *   *   * *
 *      * * * * * * * 
 */

public class PatternSquare10 {

public static void main(String[] args) {
		
		int Lines = 7;
		for (int i=0; i<Lines; i++) {
			for (int j=0; j<Lines; j++) {
			if( i==0 || i==Lines-1 || i==3 || i==j ||j==0 ||j==Lines-1 || j==3 || i+j==Lines-1 )
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
