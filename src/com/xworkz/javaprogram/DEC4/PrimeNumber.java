package com.xworkz.javaprogram.DEC4;

public class PrimeNumber {
public static void main(String[] args) {
	
	int a = 6;
	int count = 0;
	
	for(int i = 2; i<a/2; i++) {
		if(a%i == 0) {
		count++;
	}
}
if(count == 0){
		
			System.out.println("given number is not a prime number");
		}
		else {
			System.out.println("given number is a prime number");
		}
	}
}

