package com.xworkz.javaprogram.DEC19;

public class patternNumStar1 {
	
	public static void main(String[] args) {
		
		int noOfLines = 4;
		int space = noOfLines-1;
		int colLength = 1;
		int x = 1;
		
		for(int i=0; i<noOfLines; i++) {
		
			for(int j=0; j<space; j++) {
				System.out.print(" ");
				
			}
			for(int k=0; k<colLength; k++) {
				if(!(k%2==0)) {
					System.out.print("*");
				}
				else {
					System.out.print(x);
				x++;
				}
			}
			colLength+=2;
			space--;
			System.out.println();
			}
		}
	}



