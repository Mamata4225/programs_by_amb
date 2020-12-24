package com.xworkz.javaprogram.Aptiprograms2;
/*
 *      0
 *     101
 *    21012
 *   3210123
 *     
 */

public class PatternNumbers1 {
	public static void main(String[] args) {
		int rowlength = 4;
		int space = rowlength-1;
		int collength = 1;
		for (int i = 1; i<= rowlength ; i++) {
			int num = rowlength-space-1;
			for (int j=1; j<=space; j++) {
				System.out.print(" ");
				
			}
			for (int k=1; k<=collength; k++) {
				System.out.print(num);
				if(k<=collength/2)
					num--;
				else
					num++;
				
			}
			collength+=2;
			space--;
			System.out.println();
		}
	}
	

}
