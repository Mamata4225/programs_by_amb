package com.xworkz.javaprogram.DEC12;

import java.util.Scanner;

public class FactNumTest {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter the num");
	int num = s.nextInt();
	System.out.println("factorial of a number " +num+" is :");
	System.out.println(fact(num));
}
static int fact(int n) {
	if(n==1 || n==0)
		return 1;
	
	return n*fact(n-1);
}
}
