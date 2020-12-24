package com.xworkz.javaprogram.Aptiprograms2;
/* 
 *          * 
 *          *
 *          *
 *          *
 *  * * * * * * * * *
 *          *
 *          *
 *          *
 *          *
 */

public class PatternSquare5 {
	
public static void main(String[] args) {
		
		int Lines = 9;
		for (int i=0; i<Lines; i++) {
			for (int j=0; j<Lines; j++) {
			if( i==Lines/2 || j==Lines/2 ){
			
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


