package com.xworkz.javaprogram.DEC4;

public class PalindromeNumber {
public static void main(String[] args) {
	
	int num = 1212;
	int originalNumber = num;
	int mirrorNumber = 0;
	while(num>0) {
		int rem = num%10;
		mirrorNumber = mirrorNumber*10+rem;
		num = num/10;
	}
	System.out.println("mirrorNumber is :"+mirrorNumber);
	if(originalNumber == mirrorNumber) {
		System.out.println(originalNumber+" is a palindrome");
	}
	else {
		System.out.println(originalNumber+" is not a palindrome");
	}
				
	}
}




	

