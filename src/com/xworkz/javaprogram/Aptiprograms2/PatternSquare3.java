package com.xworkz.javaprogram.Aptiprograms2;
/*
 *       *
 *       * *
 *       *   *
 *       *     *
 *       * * * * *
 */
public class PatternSquare3 {
	
	public static void main(String[] args) {
		
		int Lines = 5;
		for (int i=0; i<Lines; i++) {
			for (int j=0; j<Lines; j++) {
			if( i==Lines-1 || i==j || j==0 )
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


