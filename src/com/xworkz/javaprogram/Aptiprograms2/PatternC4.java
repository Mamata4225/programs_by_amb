package com.xworkz.javaprogram.Aptiprograms2;
/* 
 *  a
 *  a b
 *  a b c
 *  a b c d
 */
public class PatternC4 {
	public static void main(String[] args) {
		int noOfLines = 4;
		for(int i=0; i<noOfLines; i++) {
			char c = 'a';
	
		for (int j=0; j<=i; j++) {
			System.out.print(c );
			c++;
		}
		System.out.println();
	}
  }
}
