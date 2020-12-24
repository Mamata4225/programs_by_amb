package com.xworkz.javaprogram.Aptiprograms2;
/*
 * 0
 * 1 0
 * 1 0 1
 * 0 1 0 1
 * 0 1 0 1 0
 * 1 0 1 0 1 0
 * 1 0 1 0 1 0 1
 */
public class PatternNom {
	public static void main(String[] args) {
		int n=6;
		int a=0;
		int j;
		for(int i=0; i<=n; i++) {
			for(j=0;j<=i; j++) {
				if(a%2==0) {
			System.out.print(0);
			}
				else {
					System.out.print(1);
					
				}
				a++;
			}
				System.out.println();
			
			
		}
	}

}
