package com.xworkz.javaprogram.DEC4;

public class PerfectSquare {
	public static void main(String[] args) {
		
		int num = 5;
		int count = 0;
		for(int i=1; i<=num/2; i++) {
			if(i*i == num) {
				count++;
			}
	}
		if(count==0) {
			System.out.println(num+" is not a perfect square");
		}
		else {
			System.out.println(num+" is a perfect square");
		}
	}

}
