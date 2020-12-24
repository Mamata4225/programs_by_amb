package com.xworkz.javaprogram.DEC4;

public class StrongNumber {
public static void main(String[] args) {
	
	int num = 145;
	int copy = num;
	int sum = 0;
	while(num>0) {
		int rem = num%10;
		num/=10;
		int fact = 1;
		for(int i=rem; i>1; i--) {
			fact*=i;
		}
		sum+=fact;
		
	}
	if(sum == copy)
		System.out.println(copy+" is a strong number");
	else
		System.out.println(copy+" is not a strong number ");
}
}
