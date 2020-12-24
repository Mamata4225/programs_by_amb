package com.xworkz.javaprogram.DEC12;

import java.util.Scanner;

public class ArmStrongNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("enter the number");
    int result = 0;
	int num = scan.nextInt();
	int numCopy = num;
	while(num>0) {
		int rem = num%10;
		num/=10;
		result +=(rem*rem*rem);
	}
	if(result==numCopy)
		System.out.println(numCopy+" is a arm stromg number");
	else
		System.out.println(numCopy+" is not a arm Strong number");
	}
}



